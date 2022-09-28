import java.util.Random;

public class Dice{

    private static int Dievalue;
    public static int Dice(){
        Random randomObj = new Random();
        Dievalue = randomObj.nextInt(6) + 1;
        return Dievalue;
    }
}