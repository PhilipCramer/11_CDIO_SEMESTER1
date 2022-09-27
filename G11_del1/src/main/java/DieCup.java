package G11_del1.src.main.java;

public class DieCup {
    public static int[] ThrowDice(int DieCount) {
        int DiceArray[] = new int[DieCount];

        for (int i = 0; i < DieCount; i++) {
            DiceArray[i] = new Dice();
        }

        return DiceArray;
    }
}