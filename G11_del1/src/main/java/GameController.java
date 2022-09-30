import java.util.Scanner;

public class GameController {
    public static void main(String[] args) {
        //instantierer Objekter og sætter spillernavne udfra bruger input
        Scanner userInput = new Scanner(System.in);
        Player player1 = new Player();
        Player player2 = new Player();
        System.out.print("Indtast navn på spiller 1: ");
        player1.setPlayerName(userInput.nextLine().trim());

        System.out.print("Indtast navn på spiller 2: ");
        player2.setPlayerName(userInput.nextLine().trim());

        PointSystem pointSystem = new PointSystem(player1, player2);
        DieCup dieCup = new DieCup(2);
        int turnCount = 1;

        //Spillet kører indtil der er fundet en vinder
        do {
            System.out.println( "Stilling er:");
            System.out.println(player1.getPlayerName() + ": " + player1.getPlayerScore());
            System.out.println(player2.getPlayerName() + ": " + player2.getPlayerScore());

            int[] playerThrow;

            //Vurderer ud fra turnCount hvem der har turen
            if(turnCount % 2 == 0){ //Spiller 2 har turen
                System.out.println(player2.getPlayerName() + " har turen. tryk enter for at kaste terningerne:");
                userInput.nextLine();
                playerThrow = dieCup.throwDice(2);
                System.out.println(player2.getPlayerName() + " har slået " + playerThrow[0] + " og " + playerThrow[1]);
                pointSystem.setScore(player2, playerThrow[0], playerThrow[1] );

            }else { //Spiller 1 har turen
                System.out.println(player1.getPlayerName() + " har turen. tryk enter for at kaste terningerne:");
                userInput.nextLine();
                playerThrow = dieCup.throwDice(2);
                System.out.println(player1.getPlayerName() + " har slået " + playerThrow[0] + " og " + playerThrow[1]);
                pointSystem.setScore(player1, playerThrow[0], playerThrow[1]);
            }
            //Printer en blank linje til at adskille resultater.
            System.out.println();

            //Opdaterer turnCount
            turnCount++;
        } while (!(pointSystem.winnerCheck(player1.getPlayerScore()) || pointSystem.winnerCheck(player2.getPlayerScore())));

        if (pointSystem.winnerCheck(player1.getPlayerScore())){
            System.out.println(player1.getPlayerName() + " har vundet med " + player1.getPlayerScore() + " point.");
        }
        else if (pointSystem.winnerCheck(player2.getPlayerScore())){
            System.out.println(player2.getPlayerName() + " har vundet med " + player2.getPlayerScore() + " point.");
        }
    }
}
