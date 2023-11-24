package org.example;

final class Rett {
    private String navn;
    private String type;
    private double pris;

    public Rett(String navn,String type,double pris){
        this.navn = navn;
        this.type = type;
        this.pris = pris;
    }

    public double getPris() {
        return pris;
    }

    public String getNavn() {
        return navn;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return   navn +
                ", " + pris;
    }
}
