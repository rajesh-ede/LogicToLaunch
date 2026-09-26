import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;

public class DrawingAnimation extends JPanel {

    private BufferedImage image;
    private BufferedImage canvas;

    private int currentY = 0;

    public DrawingAnimation() {

        try {
            image = ImageIO.read(new File("hardik.jpg"));

            canvas = new BufferedImage(
                    image.getWidth(),
                    image.getHeight(),
                    BufferedImage.TYPE_INT_RGB
            );

            // Start with a white canvas
            Graphics2D g = canvas.createGraphics();
            g.setColor(Color.WHITE);
            g.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());
            g.dispose();

        } catch (Exception e) {
            e.printStackTrace();
        }

        // Animation speed
        Timer timer = new Timer(10, e -> {

            // Draw several rows at a time
            for (int i = 0; i < 5 && currentY < image.getHeight(); i++) {

                for (int x = 0; x < image.getWidth(); x++) {

                    int rgb = image.getRGB(x, currentY);

                    canvas.setRGB(x, currentY, rgb);
                }

                currentY++;
            }

            repaint();

            if (currentY >= image.getHeight()) {
                ((Timer)e.getSource()).stop();
            }
        });

        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (canvas != null) {

            // Fit image inside the window
            int width = getWidth();
            int height = getHeight();

            g.drawImage(
                    canvas,
                    0,
                    0,
                    width,
                    height,
                    null
            );
        }
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("Java Drawing Animation");

        DrawingAnimation panel = new DrawingAnimation();

        frame.add(panel);

        frame.setSize(700, 900);

        frame.setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE
        );

        frame.setLocationRelativeTo(null);

        frame.setVisible(true);
    }
}