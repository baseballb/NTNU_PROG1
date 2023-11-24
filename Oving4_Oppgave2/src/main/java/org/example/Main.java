package org.example;

public class Main {
    public static void main(String[] args) {
        Spiller spiller_1 = new Spiller(1);
        Spiller spiller_2 = new Spiller(2);
        int runde = 0;

        while(!(spiller_1.erFerdig()) && !spiller_2.erFerdig()){
            runde++;
            System.out.println(" Spiller " + spiller_1.getspillerNummer() + " Runde " + runde);
            System.out.println(spiller_1.kastTerningen());
            System.out.println(" Spiller " + spiller_2.getspillerNummer() + " Runde " + runde);
            System.out.println(spiller_2.kastTerningen());


        }
    }
}