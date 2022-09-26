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
    private JTextField enterPlayer1Name;
    private JTextField enterPlayer2Name;
    private JLabel enterNames;
    private JButton startGame;

    public GUI(Player p1, Player p2) {
        JFrame window = new JFrame("G11 Terning Spil");
        window.setSize(600,600);
        window.setContentPane(GamePanel);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(500,500);
        winner.setVisible(false);
        window.setVisible(true);
        p1Points.setVisible(false);
        p2Points.setVisible(false);
        rollButton.setVisible(false);
        playerTurn.setVisible(false);
        playerThrow.setVisible(false);
        terning1.setVisible(false);
        terning2.setVisible(false);


        restartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Player1Name.setText("Player 1:");
                Player2Name.setText("Player 2:");
                enterPlayer1Name.setVisible(true);
                enterPlayer2Name.setVisible(true);
                p1Points.setVisible(false);
                p2Points.setVisible(false);
                startGame.setVisible(true);
            }
        });

        rollButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        startGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Player1Name.setText(enterPlayer1Name.getText() + ":");
                Player2Name.setText(enterPlayer2Name.getText() + ":");
                enterPlayer1Name.setVisible(false);
                enterPlayer2Name.setVisible(false);
                p1Points.setVisible(true);
                p2Points.setVisible(true);
                startGame.setVisible(false);
                rollButton.setVisible(true);
                playerTurn.setVisible(true);
                playerThrow.setVisible(true);
                terning1.setVisible(true);
                terning2.setVisible(true);

            }
        });
    }
}
