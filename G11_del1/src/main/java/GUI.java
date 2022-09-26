import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {
    private JPanel GamePanel;
    private JLabel Player1Name;
    private JLabel Player2Name;
    private JLabel p1Points;
    private JLabel p2Points;
    private JButton rollButton;
    private JButton restartButton;
    private JLabel title;
    public JLabel terning2;
    private JLabel terning1;
    private JLabel playerTurn;
    private JLabel winner;
    private JLabel playerThrow;

    public GUI(Player p1, Player p2) {
        JFrame window = new JFrame("G11 Terning Spil");
        window.setSize(600,600);
        window.setContentPane(GamePanel);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(500,500);
        winner.setVisible(false);
        window.setVisible(true);
        playerTurn.setText("Player 1 har turen");


        restartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        rollButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
