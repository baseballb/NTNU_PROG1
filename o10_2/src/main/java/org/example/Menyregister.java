package org.example;

import java.util.*;

public class Menyregister {
    Scanner in = new Scanner(System.in);
    private ArrayList<Meny> menyer;
    private ArrayList<Rett> retter;

    public Menyregister(){
        menyer = new ArrayList<Meny>();
        retter = new ArrayList<Rett>();
    }

    public void registrerRett(String navn, String type, double pris){
        Rett nyRett = new Rett(navn, type, pris);
        retter.add(nyRett);
    }
    public void registrerMeny(){
        Meny nyMeny = new Meny();
        while (true){
            System.out.println("Skriv inn navn på rett du vil legge til meny eller skriv EXIT for å avbryte:\n");
            String valg = in.nextLine();
            if (Objects.equals(valg, "EXIT")){
              break;
            } else {
                for (Rett rett : retter){
                    if (rett.getNavn().equals(valg)){
                        nyMeny.leggTilRett(rett);
                    }
                }
            }

        }
        menyer.add(nyMeny);
    }

    public ArrayList<Meny> getMenyer() {
        return menyer;
    }

    public Rett finnRett(String navn){
        Rett riktigRett = null;
        for (Rett rett : retter){
            if (rett.getNavn().equals(navn)){
                riktigRett = rett;
            }
        }
        return riktigRett;
    }

    public ArrayList<Rett> finnRetterMedType(String type){
        ArrayList<Rett> retterMedType = new ArrayList<Rett>();
        for (Rett rett : retter){
            if (rett.getType().equals(type)){
                retterMedType.add(rett);
            }
        }
        return retterMedType;
    }

    public ArrayList<Meny> finnMenyerInnenforPris(double pris_lower,double pris_upper){
        ArrayList<Meny> menyerInnenfor = new ArrayList<Meny>();
        for (Meny meny : menyer){
            if (meny.finnPrisHeleMeny() >= pris_lower && meny.finnPrisHeleMeny() <= pris_upper){
                menyerInnenfor.add(meny);
            }
        }
        return menyerInnenfor;
    }

    @Override
    public String toString() {
        return "Menyregister{" +
                "menyer=" + menyer +
                ", retter=" + retter +
                '}';
    }
}
