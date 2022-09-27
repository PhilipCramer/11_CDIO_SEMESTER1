class DiceInCup {
    DiceInCup() {
        int Die1;
        int Die2;
        Die1 = new Dice();
        Die2 = new Dice();
    }
}
public class DieCup {
    public static Object ThrowDice() {
        DiceInCup Cup = new DiceInCup();

        return Cup;
    }
}