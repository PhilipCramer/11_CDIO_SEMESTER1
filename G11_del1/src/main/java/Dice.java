import java.util.Random;
import java.util.Scanner;

public class Dice {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter how many die you want to roll: ");
        int numberOfDice = input.nextInt();
        if (numberOfDice == 0) {
            System.out.println("Input rollcount is 0" + "\n" + "Number of dice incremented to 1.");
            numberOfDice++;
        }
        diceRolled(numberOfDice);
        input.close();
    }
    public static void diceRolled(int a) {
        int dice;
        int result = 0;
        int total = 0;
        Random randomObj = new Random();
        System.out.print("Dice rolled : ");
        for (dice = 1; dice <= a; dice++) {
            result = randomObj.nextInt(6) + 1;
            total += result;
            System.out.print(result + " ");
        }
        System.out.println("\n" + "Total  = " + total);
    }
}
