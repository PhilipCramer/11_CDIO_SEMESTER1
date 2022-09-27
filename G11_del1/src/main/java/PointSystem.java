public class PointSystem {
    private Player P1;
    private Player P2;
    private int WinnerPoint = 40;
    public PointSystem (String P1Name, String P2Name){

        Player P1 = new Player();
        Player P2 = new Player();
        P1.setPlayerName(P1Name);
        P2.setPlayerName(P2Name);
        P1.setPlayerScore(0);
        P2.setPlayerScore(0);
        }
    public String newScore(Player player, int Dice1, int Dice2){
        if(player.getPlayerName().equals(P1.getPlayerName())){
            P1.setPlayerScore(P1.getPlayerScore() + Dice1 + Dice2);
            winnerCheck(player);
        }
        else if(player.getPlayerName().equals(P2.getPlayerName())){
            P2.setPlayerScore(P2.getPlayerScore()+ Dice1 + Dice2);
            winnerCheck(player);
        }
        else {
           return "Ugyldigt spillernavn" ;
        }
        return "Ny score for " + player.getPlayerName() + " opdateret til " + player.getPlayerScore();
    }
    public boolean winnerCheck(Player player){
        if (player.getPlayerScore() >= WinnerPoint){
        return true;
       }
        return false;
    }
}

