import org.opencv.core.*;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;

public class DetailedSketch extends JPanel {

    private BufferedImage sketch;
    private int currentY = 0;

    static {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
    }

    public DetailedSketch() {

        sketch = createSketch("hardik.png");

        // Animation
        Timer timer = new Timer(8, e -> {

            currentY += 3;

            if (currentY >= sketch.getHeight()) {
                currentY = sketch.getHeight();
                ((Timer) e.getSource()).stop();
            }

            repaint();
        });

        timer.start();
    }

    private BufferedImage createSketch(String filename) {

        // -----------------------------------------
        // 1. Load image
        // -----------------------------------------

        Mat original = Imgcodecs.imread(filename);

        if (original.empty()) {
            throw new RuntimeException(
                    "Could not find image: " + filename
            );
        }

        // -----------------------------------------
        // 2. Resize for better processing
        // -----------------------------------------

        Mat image = new Mat();

        Imgproc.resize(
                original,
                image,
                new Size(800, 1100)
        );

        // -----------------------------------------
        // 3. Convert to grayscale
        // -----------------------------------------

        Mat gray = new Mat();

        Imgproc.cvtColor(
                image,
                gray,
                Imgproc.COLOR_BGR2GRAY
        );

        // -----------------------------------------
        // 4. Remove small image noise
        // -----------------------------------------

        Mat smooth = new Mat();

        Imgproc.GaussianBlur(
                gray,
                smooth,
                new Size(5, 5),
                1.2
        );

        // -----------------------------------------
        // 5. Improve contrast
        // -----------------------------------------

        Mat contrast = new Mat();

        Imgproc.equalizeHist(
                smooth,
                contrast
        );

        // -----------------------------------------
        // 6. Detect important edges
        // -----------------------------------------

        Mat edges = new Mat();

        Imgproc.Canny(
                contrast,
                edges,
                45,
                120
        );

        // -----------------------------------------
        // 7. Make lines slightly thinner/cleaner
        // -----------------------------------------

        Mat kernel = Imgproc.getStructuringElement(
                Imgproc.MORPH_RECT,
                new Size(2, 2)
        );

        Imgproc.morphologyEx(
                edges,
                edges,
                Imgproc.MORPH_OPEN,
                kernel
        );

        // -----------------------------------------
        // 8. Remove tiny isolated dots
        // -----------------------------------------

        Mat clean = new Mat();

        Imgproc.morphologyEx(
                edges,
                clean,
                Imgproc.MORPH_CLOSE,
                kernel
        );

        // -----------------------------------------
        // 9. White background
        // -----------------------------------------

        Mat result = new Mat(
                clean.size(),
                CvType.CV_8UC1,
                new Scalar(255)
        );

        // -----------------------------------------
        // 10. Put black edges on white
        // -----------------------------------------

        for (int y = 0; y < clean.rows(); y++) {

            for (int x = 0; x < clean.cols(); x++) {

                double[] pixel =
                        clean.get(y, x);

                if (pixel != null && pixel[0] > 0) {

                    result.put(
                            y,
                            x,
                            0
                    );
                }
            }
        }

        // -----------------------------------------
        // 11. Convert to BufferedImage
        // -----------------------------------------

        return matToBufferedImage(result);
    }

    private BufferedImage matToBufferedImage(Mat mat) {

        int type =
                BufferedImage.TYPE_BYTE_GRAY;

        byte[] data =
                new byte[
                        mat.rows() *
                                mat.cols()
                        ];

        mat.get(0, 0, data);

        BufferedImage image =
                new BufferedImage(
                        mat.cols(),
                        mat.rows(),
                        type
                );

        byte[] target =
                ((DataBufferByte)
                        image.getRaster()
                                .getDataBuffer())
                        .getData();

        System.arraycopy(
                data,
                0,
                target,
                0,
                data.length
        );

        return image;
    }

    @Override
    protected void paintComponent(Graphics g) {

        super.paintComponent(g);

        if (sketch == null)
            return;

        int panelWidth = getWidth();
        int panelHeight = getHeight();

        double scaleX =
                (double) panelWidth /
                        sketch.getWidth();

        double scaleY =
                (double) panelHeight /
                        sketch.getHeight();

        double scale =
                Math.min(scaleX, scaleY);

        int width =
                (int) (sketch.getWidth() * scale);

        int height =
                (int) (sketch.getHeight() * scale);

        int x =
                (panelWidth - width) / 2;

        int y =
                (panelHeight - height) / 2;

        // Draw only the part already animated
        int visibleHeight =
                (int) (
                        height *
                                ((double) currentY /
                                        sketch.getHeight())
                );

        Shape oldClip = g.getClip();

        g.setClip(
                x,
                y,
                width,
                visibleHeight
        );

        g.drawImage(
                sketch,
                x,
                y,
                width,
                height,
                null
        );

        g.setClip(oldClip);
    }

    public static void main(String[] args) {

        JFrame frame =
                new JFrame(
                        "Detailed Hardik Sketch"
                );

        frame.setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE
        );

        frame.setSize(
                700,
                900
        );

        frame.add(
                new DetailedSketch()
        );

        frame.setLocationRelativeTo(null);

        frame.setVisible(true);
    }
}


//import javax.swing.*;
//import java.awt.*;
//import java.awt.image.BufferedImage;
//import javax.imageio.ImageIO;
//import java.io.File;
//
//public class DrawingAnimation extends JPanel {
//
//    private BufferedImage original;
//    private BufferedImage drawing;
//
//    private int currentPixel = 0;
//
//    public DrawingAnimation() {
//
//        try {
//            // Read your Hardik image
//            original = ImageIO.read(new File("hardik.png"));
//
//            // Create blank canvas
//            drawing = new BufferedImage(
//                    original.getWidth(),
//                    original.getHeight(),
//                    BufferedImage.TYPE_INT_RGB
//            );
//
//            Graphics2D g = drawing.createGraphics();
//            g.setColor(Color.WHITE);
//            g.fillRect(
//                    0,
//                    0,
//                    drawing.getWidth(),
//                    drawing.getHeight()
//            );
//            g.dispose();
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        // Animation
//        Timer timer = new Timer(1, e -> {
//
//            int width = original.getWidth();
//            int height = original.getHeight();
//
//            // Draw 500 pixels every frame
//            for (int i = 0; i < 500; i++) {
//
//                if (currentPixel >= width * height) {
//                    ((Timer)e.getSource()).stop();
//                    break;
//                }
//
//                int x = currentPixel % width;
//                int y = currentPixel / width;
//
//                int pixel = original.getRGB(x, y);
//
//                drawing.setRGB(x, y, pixel);
//
//                currentPixel++;
//            }
//
//            repaint();
//        });
//
//        timer.start();
//    }
//
//    @Override
//    protected void paintComponent(Graphics g) {
//
//        super.paintComponent(g);
//
//        if (drawing != null) {
//
//            // Keep the image's proportions
//            int panelWidth = getWidth();
//            int panelHeight = getHeight();
//
//            double scaleX =
//                    (double) panelWidth / drawing.getWidth();
//
//            double scaleY =
//                    (double) panelHeight / drawing.getHeight();
//
//            double scale =
//                    Math.min(scaleX, scaleY);
//
//            int newWidth =
//                    (int)(drawing.getWidth() * scale);
//
//            int newHeight =
//                    (int)(drawing.getHeight() * scale);
//
//            int x =
//                    (panelWidth - newWidth) / 2;
//
//            int y =
//                    (panelHeight - newHeight) / 2;
//
//            g.drawImage(
//                    drawing,
//                    x,
//                    y,
//                    newWidth,
//                    newHeight,
//                    null
//            );
//        }
//    }
//
//    public static void main(String[] args) {
//
//        JFrame frame =
//                new JFrame("Hardik Pandya Drawing");
//
//        DrawingAnimation panel =
//                new DrawingAnimation();
//
//        frame.add(panel);
//
//        frame.setSize(600, 800);
//
//        frame.setDefaultCloseOperation(
//                JFrame.EXIT_ON_CLOSE
//        );
//
//        frame.setLocationRelativeTo(null);
//
//        frame.setVisible(true);
//    }
//}