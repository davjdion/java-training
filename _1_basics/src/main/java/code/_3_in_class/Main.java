package code._3_in_class;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        //TODO put your code changes in here
        Boxer ion = new Boxer ("ion",100,10);
        Boxer vasile = new Boxer ("vasile");
        Boxer brucelee = new BruceLee ("brucelee");

        //start meci
        startBoxingMatch(ion, brucelee);
        announceVictory(ion,brucelee);
    }
    private static void announceVictory(Boxer b01, Boxer b02) {
        if(b01.health <= 0)
            System.out.println(b02.nume + " a casitgat meciul");
        else
            System.out.println(b01.nume + " a casitgat meciul");
    }

    private static void startBoxingMatch(Boxer ion, Boxer vasile) {
        Random random = new Random();
        while (ion.health >0 && vasile.health>0)
        {
            int zeroOrOne = random.nextInt(2);
            if(zeroOrOne == 0)
                ion.attack(vasile);
            else
                vasile.attack(ion);
        }
    }
}