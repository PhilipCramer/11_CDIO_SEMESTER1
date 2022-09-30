public class DieCup {
    private int[] DiceArray;
    //En contructer, der laver et array af tal.
    DieCup(int DieCount) {
        DiceArray = new int[DieCount];
    }
    //En metode der "kaster" terningerne.
    public int[] throwDice(int DieCount) {
        //Tilgiver "Cup" et array af en given længde fra contructeren.
        DieCup Cup = new DieCup(DieCount);
        //Laver en variable (generateDie) der er en ny Dice klasse.
        Dice generateDie = new Dice();
        //Et for loop der "kaster" terningerne og sætter hver verdi ind i DiceArray.
        for (int i = 0; i < DieCount; i++) {
            Cup.DiceArray[i] = generateDie.Dice();
        }

        //Retunere et array med alle terninge verdierne.
        return Cup.DiceArray;
    }
}