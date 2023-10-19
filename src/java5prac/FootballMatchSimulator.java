package java5prac;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FootballMatchSimulator {
    private JFrame frame;
    private JButton milanButton;
    private JButton madridButton;
    private JLabel resultLabel;
    private JLabel lastScorerLabel;
    private JLabel winnerLabel;
    private int milanScore = 0;
    private int madridScore = 0;

    public FootballMatchSimulator() {
        frame = new JFrame("Football Match Simulator");
        frame.setLayout(new GridLayout(3, 2));

        milanButton = new JButton("AC Milan");
        madridButton = new JButton("Real Madrid");
        resultLabel = new JLabel("Result: 0 X 0");
        lastScorerLabel = new JLabel("Last Scorer: N/A");
        winnerLabel = new JLabel("Winner: DRAW");

        milanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                milanScore++;
                updateLabels("AC Milan");
            }
        });

        madridButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                madridScore++;
                updateLabels("Real Madrid");
            }
        });

        frame.add(milanButton);
        frame.add(madridButton);
        frame.add(resultLabel);
        frame.add(lastScorerLabel);
        frame.add(winnerLabel);

        frame.getContentPane().setBackground(Color.PINK); // Установка розового фона

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void updateLabels(String lastScorer) {
        resultLabel.setText("Result: " + milanScore + " X " + madridScore);
        lastScorerLabel.setText("Last Scorer: " + lastScorer);
        if (milanScore > madridScore) {
            winnerLabel.setText("Winner: AC Milan");
        } else if (milanScore < madridScore) {
            winnerLabel.setText("Winner: Real Madrid");
        } else {
            winnerLabel.setText("Winner: DRAW");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FootballMatchSimulator();
            }
        });
    }
}
