import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;

public class DrawingAnimation extends JPanel {

    private BufferedImage outline;
    private int currentY = 0;

    public DrawingAnimation() {

        try {
            BufferedImage original =
                    ImageIO.read(new File("hardik.png"));

            int width = original.getWidth();
            int height = original.getHeight();

            outline = new BufferedImage(
                    width,
                    height,
                    BufferedImage.TYPE_INT_RGB
            );

            // White background
            Graphics2D g = outline.createGraphics();
            g.setColor(Color.WHITE);
            g.fillRect(0, 0, width, height);
            g.dispose();

            // Convert image to outline
            for (int y = 1; y < height - 1; y++) {

                for (int x = 1; x < width - 1; x++) {

                    int center = gray(original.getRGB(x, y));

                    int right = gray(original.getRGB(x + 1, y));
                    int bottom = gray(original.getRGB(x, y + 1));

                    int difference =
                            Math.abs(center - right)
                                    + Math.abs(center - bottom);

                    if (difference > 40) {
                        outline.setRGB(x, y, Color.BLACK.getRGB());
                    }
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        // Animation
        Timer timer = new Timer(5, e -> {

            currentY += 3;

            if (currentY >= outline.getHeight()) {
                currentY = outline.getHeight();
                ((Timer)e.getSource()).stop();
            }

            repaint();
        });

        timer.start();
    }

    // Convert RGB to grayscale
    private int gray(int rgb) {

        int r = (rgb >> 16) & 255;
        int g = (rgb >> 8) & 255;
        int b = rgb & 255;

        return (r + g + b) / 3;
    }

    @Override
    protected void paintComponent(Graphics g) {

        super.paintComponent(g);

        if (outline == null)
            return;

        int width = getWidth();
        int height = getHeight();

        double scaleX =
                (double) width / outline.getWidth();

        double scaleY =
                (double) height / outline.getHeight();

        double scale =
                Math.min(scaleX, scaleY);

        int newWidth =
                (int)(outline.getWidth() * scale);

        int newHeight =
                (int)(outline.getHeight() * scale);

        int x =
                (width - newWidth) / 2;

        int y =
                (height - newHeight) / 2;

        // Only show the part that has been "drawn"
        Shape oldClip = g.getClip();

        g.setClip(
                x,
                y,
                newWidth,
                (int)(newHeight *
                        ((double) currentY /
                                outline.getHeight()))
        );

        g.drawImage(
                outline,
                x,
                y,
                newWidth,
                newHeight,
                null
        );

        g.setClip(oldClip);
    }

    public static void main(String[] args) {

        JFrame frame =
                new JFrame("Hardik - Line Drawing");

        frame.add(new DrawingAnimation());

        frame.setSize(600, 800);

        frame.setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE
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