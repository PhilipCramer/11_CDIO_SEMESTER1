public class DiceTest {
    public static void main(String[] args) {
        DieCup dieCup = new DieCup(2);
        int numberOfRolls = 1000;
        int[] results = new int[13];

        for(int i = 0; i < numberOfRolls; i++){
            int[] roll = dieCup.throwDice(2);
            results[roll[0] + roll[1]]++;
        }
        System.out.println("Der blev slået:");
        for(int i = 2; i< results.length; i++){
            System.out.println(i + ": " + results[i] + " gange eller " + (((results[i])*100)/1000.0) + "% af gangene");
        }
    }
}
