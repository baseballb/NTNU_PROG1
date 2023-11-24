package org.example;
import java.util.*;

public class ArrangementRegister {
    public ArrayList<Arrangement> arrangementer;

    public ArrangementRegister(){
        arrangementer = new ArrayList<Arrangement>();
    }

    public Arrangement opprettArrangement(long tidspunkt, String arrNavn, String sted, String host, String type){
        int arrNr = arrangementer.size();
        Arrangement nyttArrangement = new Arrangement(arrNr, tidspunkt, arrNavn, sted, host, type);
        arrangementer.add(nyttArrangement);
        return nyttArrangement;

    }

    public ArrayList<Arrangement> eventsAtLocation(String sted){
        ArrayList<Arrangement> eventAtLocationArray = new ArrayList<Arrangement>();
        for (Arrangement arrangement : arrangementer) {
            if (arrangement.getSted().equals(sted)) {
                eventAtLocationArray.add(arrangement);
            }
        }
        return eventAtLocationArray;
    }

    public ArrayList<Arrangement> eventsAtTime(long tidspunkt){
        ArrayList<Arrangement> eventsAtTimeArray = new ArrayList<Arrangement>();
        for (Arrangement arrangement : arrangementer) {
            if (arrangement.getTidspunkt() / 10000 == tidspunkt) {
                eventsAtTimeArray.add(arrangement);
            }
        }
        return eventsAtTimeArray;
    }

    public ArrayList<Arrangement> eventsBetweenTime(long dato_1, long dato_2){
        ArrayList<Arrangement> eventsBetweenTimeArray = new ArrayList<Arrangement>();
        for (Arrangement arrangement : arrangementer) {
            long dato_arrangement = arrangement.getTidspunkt() / 10000;
            if (dato_arrangement >= dato_1 && dato_arrangement <= dato_2){
                eventsBetweenTimeArray.add(arrangement);
            }
        }
        eventsBetweenTimeArray.sort(Comparator.comparingLong(Arrangement::getTidspunkt));
        return eventsBetweenTimeArray;
    }

    public ArrayList<Arrangement> sortereListe(int valg){
        ArrayList<Arrangement> sortertListe = arrangementer;
        if (valg == 1){
            sortertListe.sort(Comparator.comparing(Arrangement::getSted));
        }
        if (valg == 2){
            sortertListe.sort(Comparator.comparing(Arrangement::getType));
        }
        if (valg == 3){
            sortertListe.sort(Comparator.comparingLong(Arrangement::getTidspunkt));
        }
        return sortertListe;
    }
}

