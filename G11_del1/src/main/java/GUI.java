import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {
    private JPanel GamePanel;
    private JLabel player1Name;
    private JLabel player2Name;
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
    private JLabel player3Name;
    private JLabel p3Points;
    private JTextField enterPlayer3Name;
    private JLabel player4Name;
    private JLabel p4Points;
    private JTextField enterPlayer4Name;

    public GUI() {
        JFrame window = new JFrame("G11 Terning Spil");
        window.setSize(600,600);
        window.setContentPane(GamePanel);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(500,500);
        winner.setVisible(false);
        window.setVisible(true);

        enterPlayer1Name.setVisible(true);
        enterPlayer2Name.setVisible(true);
        enterPlayer3Name.setVisible(true);
        enterPlayer4Name.setVisible(true);

        p1Points.setVisible(false);
        p2Points.setVisible(false);
        p3Points.setVisible(false);
        p4Points.setVisible(false);

        rollButton.setVisible(false);
        playerTurn.setVisible(false);
        playerThrow.setVisible(false);
        terning1.setVisible(false);
        terning2.setVisible(false);


        restartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                player1Name.setText("Player 1:");
                player2Name.setText("Player 2:");
                player3Name.setText("Player 3:");
                player4Name.setText("Player 4:");

                player1Name.setVisible(true);
                player2Name.setVisible(true);
                player3Name.setVisible(true);
                player4Name.setVisible(true);

                enterPlayer1Name.setVisible(true);
                enterPlayer2Name.setVisible(true);
                enterPlayer3Name.setVisible(true);
                enterPlayer4Name.setVisible(true);

                p1Points.setVisible(false);
                p2Points.setVisible(false);
                p3Points.setVisible(false);
                p4Points.setVisible(false);

                rollButton.setVisible(false);
                playerTurn.setVisible(false);
                playerThrow.setVisible(false);
                terning1.setVisible(false);
                terning2.setVisible(false);
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
                player1Name.setText(enterPlayer1Name.getText() + ":");
                enterPlayer1Name.setVisible(false);
                p1Points.setVisible(true);

                player2Name.setText(enterPlayer2Name.getText() + ":");
                enterPlayer2Name.setVisible(false);
                p2Points.setVisible(true);

                if (!enterPlayer3Name.getText().equals("")) {
                    player3Name.setText(enterPlayer3Name.getText() + ":");
                    enterPlayer3Name.setVisible(false);
                    p3Points.setVisible(true);
                } else{
                    player3Name.setVisible(false);
                }
                if (!enterPlayer4Name.getText().equals("")) {
                    player4Name.setText(enterPlayer4Name.getText() + ":");
                    enterPlayer4Name.setVisible(false);
                    p4Points.setVisible(true);
                } else {
                    player4Name.setVisible(false);
                }

                enterPlayer1Name.setVisible(false);
                enterPlayer2Name.setVisible(false);
                enterPlayer3Name.setVisible(false);
                enterPlayer4Name.setVisible(false);

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
