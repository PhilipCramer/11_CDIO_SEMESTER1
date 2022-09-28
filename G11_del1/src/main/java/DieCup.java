public class DieCup {
    private static int[] DiceArray;
    DieCup(int DieCount) {
        DiceArray = new int[DieCount];
    }
    public static int[] ThrowDice(int DieCount) {
        DieCup Cup = new DieCup(DieCount);
        Dice generateDie = new Dice();
        for (int i = 0; i < DieCount; i++) {
            Cup.DiceArray[i] = generateDie.Dice();
        }

        return Cup.DiceArray;
    }
}