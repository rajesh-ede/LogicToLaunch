
import org.opencv.core.*;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DetailedSketch extends JPanel {

    private BufferedImage sketch;

    private final List<Rectangle> revealedTiles =
            new ArrayList<>();

    private List<Rectangle> allTiles;

    private Timer timer;

    private static final int TILE_SIZE = 20;

    // Load OpenCV native library
    static {
        nu.pattern.OpenCV.loadLocally();
    }

    public DetailedSketch() {

        // Change this filename if needed
        sketch = createSketch("rider_clean.png");

        createRandomTiles();

        // Random drawing animation
        timer = new Timer(8, e -> {

            int count = 8;

            for (int i = 0; i < count; i++) {

                if (allTiles.isEmpty()) {
                    break;
                }

                revealedTiles.add(
                        allTiles.remove(allTiles.size() - 1)
                );
            }

            repaint();

            if (allTiles.isEmpty()) {
                timer.stop();
            }
        });

        timer.start();
    }

    // ==========================================
    // IMAGE PROCESSING
    // ==========================================

    private BufferedImage createSketch(String filename) {

        File file = new File(filename);

        System.out.println(
                "Loading image: " +
                        file.getAbsolutePath()
        );

        if (!file.exists()) {
            throw new RuntimeException(
                    "IMAGE NOT FOUND: " +
                            file.getAbsolutePath()
            );
        }

        Mat original = Imgcodecs.imread(
                file.getAbsolutePath()
        );

        if (original.empty()) {
            throw new RuntimeException(
                    "Unable to read image!"
            );
        }

        // Resize while maintaining aspect ratio
        Mat image = new Mat();

        double scale = Math.min(
                900.0 / original.cols(),
                1200.0 / original.rows()
        );

        Imgproc.resize(
                original,
                image,
                new Size(
                        original.cols() * scale,
                        original.rows() * scale
                ),
                0,
                0,
                Imgproc.INTER_CUBIC
        );

        // ======================================
        // Improve image details
        // ======================================

        Mat blurred = new Mat();

        Imgproc.GaussianBlur(
                image,
                blurred,
                new Size(0, 0),
                2
        );

        Mat sharpened = new Mat();

        Core.addWeighted(
                image,
                1.35,
                blurred,
                -0.35,
                0,
                sharpened
        );

        // Slightly improve contrast
        Mat result = new Mat();

        sharpened.convertTo(
                result,
                -1,
                1.08,
                2
        );

        // Convert to Java image
        return matToBufferedImage(result);
    }

    // ==========================================
    // OPENCV MAT TO JAVA BUFFERED IMAGE
    // ==========================================

    private BufferedImage matToBufferedImage(Mat mat) {

        int width = mat.cols();
        int height = mat.rows();

        int channels = mat.channels();

        if (channels != 3) {
            throw new RuntimeException(
                    "Expected a 3-channel color image."
            );
        }

        BufferedImage image =
                new BufferedImage(
                        width,
                        height,
                        BufferedImage.TYPE_3BYTE_BGR
                );

        byte[] data = new byte[
                width * height * channels
                ];

        mat.get(0, 0, data);

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

    // ==========================================
    // CREATE RANDOM DRAWING ORDER
    // ==========================================

    private void createRandomTiles() {

        allTiles = new ArrayList<>();

        int width = sketch.getWidth();
        int height = sketch.getHeight();

        for (int y = 0; y < height; y += TILE_SIZE) {

            for (int x = 0; x < width; x += TILE_SIZE) {

                int tileWidth = Math.min(
                        TILE_SIZE,
                        width - x
                );

                int tileHeight = Math.min(
                        TILE_SIZE,
                        height - y
                );

                allTiles.add(
                        new Rectangle(
                                x,
                                y,
                                tileWidth,
                                tileHeight
                        )
                );
            }
        }

        // Shuffle tiles for random appearance
        Collections.shuffle(allTiles);
    }

    // ==========================================
    // DISPLAY ANIMATION
    // ==========================================

    @Override
    protected void paintComponent(Graphics g) {

        super.paintComponent(g);

        if (sketch == null) {
            return;
        }

        Graphics2D g2 = (Graphics2D) g.create();

        g2.setColor(Color.WHITE);
        g2.fillRect(
                0,
                0,
                getWidth(),
                getHeight()
        );

        double scale = Math.min(
                (double) getWidth() / sketch.getWidth(),
                (double) getHeight() / sketch.getHeight()
        );

        int width = (int) (sketch.getWidth() * scale);
        int height = (int) (sketch.getHeight() * scale);

        int offsetX = (getWidth() - width) / 2;
        int offsetY = (getHeight() - height) / 2;

        // Draw only revealed random tiles
        for (Rectangle tile : revealedTiles) {

            int sx1 = tile.x;
            int sy1 = tile.y;

            int sx2 = tile.x + tile.width;
            int sy2 = tile.y + tile.height;

            int dx1 = offsetX + (int) (sx1 * scale);
            int dy1 = offsetY + (int) (sy1 * scale);

            int dx2 = offsetX + (int) (sx2 * scale);
            int dy2 = offsetY + (int) (sy2 * scale);

            g2.drawImage(
                    sketch,
                    dx1, dy1, dx2, dy2,
                    sx1, sy1, sx2, sy2,
                    null
            );
        }

        g2.dispose();
    }

    // ==========================================
    // MAIN METHOD
    // ==========================================

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {

            JFrame frame = new JFrame(
                    "Color Photo Enhancement"
            );

            frame.setDefaultCloseOperation(
                    JFrame.EXIT_ON_CLOSE
            );

            frame.setSize(800, 1000);

            frame.add(new DetailedSketch());

            frame.setLocationRelativeTo(null);

            frame.setVisible(true);
        });
    }
}
