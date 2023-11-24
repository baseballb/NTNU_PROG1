package org.example;
import java.util.Random;

public class MinRandom {

    private Random tilfeldig = new Random();
    public int nesteHeltall(int nedre, int ovre){
        int heltallRange = ovre - nedre;
        int resultat = tilfeldig.nextInt(heltallRange);
        resultat = resultat + nedre;
        return resultat;
    }

    public double nesteDesimaltall(double nedre, double ovre){
        double desimalRange = ovre - nedre;
        double resultat = tilfeldig.nextDouble();
        resultat = nedre + (desimalRange * resultat);
        return resultat;
    }
}
