package org.example;

public class Main {
    public static void main(String[] args) {
        Brok brok_1 = new Brok(2, 6);
        Brok brok_2 = new Brok(1);

        brok_1.addere(brok_2);
        System.out.println(brok_1.getSvar());
        brok_1.multiplisere(brok_2);
        System.out.println(brok_1.getSvar());
        brok_1.subtrahere(brok_2);
        System.out.println(brok_1.getSvar());
        brok_1.dividere(brok_2);
        System.out.println(brok_1.getSvar());
    }
}

class Brok {
    private double teller, nevner, svarTeller, svarNevner;
    private String svar;

    public Brok(double teller, double nevner) {
        if (nevner == 0) {
            throw new IllegalArgumentException("Nevner kan ikke være 0");
        } else {
            this.teller = teller;
            this.nevner = nevner;
        }
    }

    public Brok(double teller){
        this.teller = teller;
        this.nevner = 1;
    }

    public String getSvar(){
        return this.svar;
    }

    public void addere(Brok i){
        this.svarTeller = (this.teller * i.nevner) + (i.teller * this.nevner);
        this.svarNevner = this.nevner * i.nevner;
        this.svar = this.svarTeller +"/" + this.svarNevner;
    }

    public void subtrahere(Brok i){
        this.svarTeller = (this.teller * i.nevner) - (i.teller * this.nevner);
        this.svarNevner = this.nevner * i.nevner;
        this.svar = this.svarTeller +"/" + this.svarNevner;
    }

    public void dividere(Brok i){
        this.svarTeller = this.teller * i.nevner;
        this.svarNevner = i.teller * this.nevner;
        this.svar = this.svarTeller +"/" + this.svarNevner;
    }

    public void multiplisere(Brok i){
        this.svarTeller = this.teller * i.teller;
        this.svarNevner = this.nevner * i.nevner;
        this.svar = this.svarTeller +"/" + this.svarNevner;
    }
}