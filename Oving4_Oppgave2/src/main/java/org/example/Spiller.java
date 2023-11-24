package org.example;

import java.util.Random;

public class Spiller {
    private int spillerNummer;
    private int sumPoeng = 0;

    public Spiller(int spillerNummer){
        this.spillerNummer = spillerNummer;
    }

    public int getSumPoeng(){
        return sumPoeng;
    }

    public int getspillerNummer(){return spillerNummer;}
    public int kastTerningen(){
        java.util.Random terning = new java.util.Random();
        int terningkast = terning.nextInt(6) + 1;
        this.sumPoeng += terningkast;
        return sumPoeng;
    }

    public boolean erFerdig(){
        return (sumPoeng >= 100);
    }

}
