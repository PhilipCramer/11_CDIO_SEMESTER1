import java.util.Random;
//Her bliver der importeret javas random funktion
public class Dice{

    private int Dievalue;
    public int Dice(){
        Random randomObj = new Random();
        Dievalue = randomObj.nextInt(6) + 1;
        return Dievalue;
        // Grunden til at den siger +1 er, at java altid starter i 0, Det ville så blive 0,1,2,3,4 og 5. Så ved at sige +1, gør man at den tager fra 1 til 6.
    }
}