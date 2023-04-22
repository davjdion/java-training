package code._3_in_class;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        //TODO put your code changes in here
        IBoxer ion = new Boxer ("ion",100,10);
        IBoxer vasile = new Boxer ("vasile");
        IBoxer brucelee = new BruceLee ("brucelee");

        //start meci
        startBoxingMatch(ion, brucelee);
        announceVictory(ion,brucelee);
    }
    private static void announceVictory(IBoxer b01, IBoxer b02) {
        if(!b01.isAlive())
            System.out.println(b02.getName() + " a casitgat meciul");
        else
            System.out.println(b01.getName() + " a casitgat meciul");
    }

    //startBoxingMatch_Boxer
    //startBoxingMatch_IBoxer
    private static void startBoxingMatch(IBoxer ion, IBoxer vasile) {
        Random random = new Random();
        while (ion.isAlive() && vasile.isAlive())
        {
            int zeroOrOne = random.nextInt(2);
            if(zeroOrOne == 0)
                ion.attack(vasile);
            else
                vasile.attack(ion);
        }
    }
}