package org.example;

public class Valuta {
    String navn;

    double kurs;

    public Valuta(int type){
        if(type == 1) {
            this.navn = "Dollar";
            this.kurs = 10.75;
        } else if (type == 2) {
            this.navn = "Euro";
            this.kurs = 11.49;
        } else if (type == 3) {
            this.navn = "Sek";
            this.kurs = 0.96;
        } else {
            this.navn = "Nok";
            this.kurs = 1.0;
        }
    }
    public double getKurs(){
        return kurs;
    }

    public String getNavn(){
        return navn;
    }


}

