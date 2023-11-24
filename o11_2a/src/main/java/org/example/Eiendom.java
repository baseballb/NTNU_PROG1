package org.example;

public class Eiendom {

    private int kommunenummer, gnr, bnr;
    private String kommunenavn, bruksnavn, eiernavn;
    private double areal;

    public Eiendom(int kommunenummer, int gnr, int bnr, String kommunenavn, String bruksnavn, String eiernavn, double areal) {
        this.kommunenummer = kommunenummer;
        this.gnr = gnr;
        this.bnr = bnr;
        this.kommunenavn = kommunenavn;
        this.bruksnavn = bruksnavn;
        this.eiernavn = eiernavn;
        this.areal = areal;
    }

    public String kgb(){
        return String.valueOf(kommunenummer) + "-" + String.valueOf(gnr) + "/" + String.valueOf(bnr);
    }

    public double getAreal() {
        return areal;
    }

    public int getBnr() {
        return bnr;
    }

    public int getGnr() {
        return gnr;
    }

    public int getKommunenummer() {
        return kommunenummer;
    }

    public String getBruksnavn() {
        return bruksnavn;
    }

    public String getEiernavn() {
        return eiernavn;
    }

    public String getKommunenavn() {
        return kommunenavn;
    }

    public void setAreal(double areal) {
        this.areal = areal;
    }

    public void setEiernavn(String eiernavn) {
        this.eiernavn = eiernavn;
    }

    public void setBruksnavn(String bruksnavn) {
        this.bruksnavn = bruksnavn;
    }

    @Override
    public String toString() {
        return "Eiendom{" +
                "kommunenummer=" + kommunenummer +
                ", gnr=" + gnr +
                ", bnr=" + bnr +
                ", kommunenavn='" + kommunenavn + '\'' +
                ", bruksnavn='" + bruksnavn + '\'' +
                ", eiernavn='" + eiernavn + '\'' +
                ", areal=" + areal +
                '}';
    }
}
