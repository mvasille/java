package java5prac;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class ImageViewer {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java ImageViewer <image_path>");
            System.exit(1);
        }

        String imagePath = args[0];

        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Image Viewer");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            try {
                File imageFile = new File(imagePath);
                BufferedImage image = ImageIO.read(imageFile);

                if (image != null) {
                    ImageIcon icon = new ImageIcon(image);
                    JLabel label = new JLabel(icon);
                    frame.getContentPane().add(label);
                } else {
                    System.err.println("Failed to load the image.");
                }
            } catch (IOException e) {
                System.err.println("Error loading the image: " + e.getMessage());
            }

            frame.pack();
            frame.setVisible(true);
        });
    }
}
