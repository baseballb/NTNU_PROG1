package org.example;

import java.util.ArrayList;

public class Meny {
    public ArrayList<Rett> meny;

    public Meny(){
        meny = new ArrayList<Rett>();
    }

    public void leggTilRett(Rett rett){
        meny.add(rett);
    }

    public ArrayList<Rett> getMeny() {
        return meny;
    }

    public double finnPrisHeleMeny(){
        double totalpris = 0;
        for (Rett rett : meny){
            totalpris += rett.getPris();
        }
        return totalpris;
    }

    @Override
    public String toString() {
        return "Meny{" +
                "meny=" + meny +
                '}';
    }
}
