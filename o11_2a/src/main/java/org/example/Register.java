package org.example;

import java.util.ArrayList;

public class Register {
    private ArrayList<Eiendom> eiendommer;

    public ArrayList<Eiendom> getEiendommer() {
        return eiendommer;
    }

    public Register(){
        eiendommer = new ArrayList<Eiendom>();
    }
    public void registrerEiendom(int kommunenummer, int gnr, int bnr, String kommunenavn, String bruksnavn, String eiernavn, double areal){
        Eiendom nyEiendom = new Eiendom(kommunenummer,gnr, bnr, kommunenavn, bruksnavn, eiernavn, areal);
        eiendommer.add(nyEiendom);
    }
    public void fjernEiendom(String kgb){
        for (Eiendom eiendom : eiendommer){
            if (eiendom.kgb().equals(kgb)){
                eiendommer.remove(eiendom);
            }
        }
    }
    public int hvorMange(){
        return eiendommer.size();
    }
    public Eiendom finnEiendom(String kgb){
        for (Eiendom eiendom : eiendommer){
            if (eiendom.kgb().equals(kgb)){
                return eiendom;
            }
        }
        return null;
    }
    public double averageAreal(){
        double totalAreal = 0;
        for (Eiendom eiendom : eiendommer){
            totalAreal += eiendom.getAreal();
        }
        return totalAreal / hvorMange();
    }
    public ArrayList<Eiendom> finnEtterGnr(int gnr){
        ArrayList<Eiendom> eiendommerMedGNR = new ArrayList<>();
        for (Eiendom eiendom : eiendommer){
            if (eiendom.getGnr() == (gnr)){
                eiendommerMedGNR.add(eiendom);
            }
        }
        return eiendommerMedGNR;
    }

    @Override
    public String toString() {
        return "Register{" +
                "eiendommer=" + eiendommer +
                '}';
    }
}

