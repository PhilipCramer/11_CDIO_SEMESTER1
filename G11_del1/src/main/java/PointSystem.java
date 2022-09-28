public class PointSystem {
    private int WinnerPoint = 40;

    public PointSystem (Player P1, Player P2){
    }

    public int setScore(Player player, int Dice1, int Dice2){
        int diceSum = Dice1 + Dice2;
        int newPlayerScore = player.getPlayerScore() + diceSum;
        player.setPlayerScore(newPlayerScore);

        return (player.getPlayerScore());
    }
}

