package org.example;

import java.util.Arrays;

public class Tekstbehandler {
    private String tekst;

    public Tekstbehandler(String tekst){
        this.tekst = tekst;
    }

    public int lengde(){
        return tekst.split(" ").length;
    }

    public double gjennomsnittAntall(){
        String[] deltOpp = tekst.split("\\W+");
        int bokstaver = 0;
        System.out.println(Arrays.toString(deltOpp));
        for (int i = 0; i < deltOpp.length; i++){
            bokstaver += deltOpp[i].length();
        }
        return (double) bokstaver / deltOpp.length;
    }

    public double periodeGjennomsnitt(){
        String[] perioder = tekst.split("[!:?.,]");
        return (double) this.lengde() / (double) perioder.length;
    }

    public String byttet(String skalUt, String skalInn){
        return tekst.replaceAll(skalUt, skalInn);
    }

    public String getTekst(){
        return tekst;
    }

    public String storeBokstaver(){
        return tekst.toUpperCase();
    }
}
