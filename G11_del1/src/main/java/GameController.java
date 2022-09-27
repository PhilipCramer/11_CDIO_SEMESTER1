import javax.lang.model.element.Name;
import java.util.Scanner;

public class GameController {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Indtast navn på spiller 1: ");
        String name1 = userInput.nextLine();

        System.out.print("Indtast navn på spiller 2: ");
        String name2 = userInput.nextLine();

        PointSystem pointSystem = new PointSystem(name1, name2);
        //DieCup dieCup = new DieCup();
        int turnCount = 1;

        do {
            System.out.println( "Stilling er:");


            if(turnCount % 2 == 0){
                System.out.println(name2 + " har turen. tryk enter for at kaste terningerne:");
                userInput.nextLine();

            }else {
                System.out.println(name1 + " har turen. tryk enter for at kaste terningerne:");
                userInput.nextLine();
            }




            turnCount++;
        } while (false); //!pointSystem.winnerCheck() || !pointSystem.winnerCheck());

        System.out.println("Vinder");


    }
}
