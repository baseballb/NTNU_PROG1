package org.example;

public class Arrangement {
    private final int arrNr;
    private final long tidspunkt;
    private final String arrNavn, sted, host, type;

    public Arrangement(int arrNr, long tidspunkt, String arrNavn, String sted, String host, String type){
        this.arrNr = arrNr;
        this.arrNavn = arrNavn;
        this.sted = sted;
        this.host = host;
        this.type = type;
        this.tidspunkt = tidspunkt;
    }
    public int getArrNr(){
        return arrNr;
    }
    public long getTidspunkt(){
        return tidspunkt;
    }
    public String getArrNavn(){
        return arrNavn;
    }
    public String getSted(){
        return sted;
    }
    public String getHost(){
        return host;
    }
    public String getType(){
        return type;
    }

    public String toString() {
        return arrNavn + ", " + sted + ", " + tidspunkt + ", " + host + ", " + type + "\n";
    }
}
