package java5prac.shape;
import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class RandomShapes extends JPanel {
    private final int NUM_SHAPES = 20;
    private final int WIDTH = 800;
    private final int HEIGHT = 600;
    private Shape[] shapes;

    public RandomShapes() {
        shapes = new Shape[NUM_SHAPES];
        Random rand = new Random();

        for (int i = 0; i < NUM_SHAPES; i++) {
            Color randomColor = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
            int x = rand.nextInt(WIDTH);
            int y = rand.nextInt(HEIGHT);

            if (rand.nextBoolean()) {
                int radius = rand.nextInt(50) + 20;
                shapes[i] = new Circle(randomColor, x, y, radius);
            } else {
                int width = rand.nextInt(100) + 20;
                int height = rand.nextInt(100) + 20;
                shapes[i] = new Rectangle(randomColor, x, y, width, height);
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Shape shape : shapes) {
            shape.draw(g);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Random Shapes");
            RandomShapes randomShapes = new RandomShapes();
            frame.add(randomShapes);
            frame.setSize(randomShapes.WIDTH, randomShapes.HEIGHT);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
