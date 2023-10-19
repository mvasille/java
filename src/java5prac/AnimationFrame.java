package java5prac;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnimationFrame extends JFrame {
    private int currentFrame = 0;
    private Timer timer;
    private ImageIcon[] frames;

    public AnimationFrame() {
        frames = new ImageIcon[3]; // Замените 5 на количество кадров в вашей анимации

        for (int i = 0; i < frames.length; i++) {
            frames[i] = new ImageIcon("frame" + i + ".png"); // Замените "frame" + i + ".png" на путь к вашим изображениям
        }

        timer = new Timer(100, new ActionListener() { // 100 - это задержка между кадрами в миллисекундах
            @Override
            public void actionPerformed(ActionEvent e) {
                currentFrame = (currentFrame + 1) % frames.length;
                repaint();
            }
        });

        timer.start();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        frames[currentFrame].paintIcon(this, g, 0, 0);
    }

    public static void main(String[] args) {
        AnimationFrame frame = new AnimationFrame();
        frame.setSize(800, 600); // Задайте размер окна по вашим потребностям
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
