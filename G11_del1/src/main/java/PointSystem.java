public class PointSystem {
    private int WinnerPoint = 40;
    public PointSystem (Player P1, Player P2){

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

