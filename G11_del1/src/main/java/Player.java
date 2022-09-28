public class Player {
    private String name;
    private Integer score;

    public Player(){
// Oprettet klassen Player som får et navn og en score.
        score = 0;
    }
    public void setPlayerName(String String){
        name = String;
    }
    public void setPlayerScore(Integer Int){
        score = Int;
    }
    public String getPlayerName(){
        return name;
    }
    public Integer getPlayerScore(){
        return score;
    }
}
