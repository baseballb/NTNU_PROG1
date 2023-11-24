package org.example;
import java.util.*;

import static java.lang.Long.parseLong;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrangementRegister register = new ArrangementRegister();
        while (true){
            System.out.println("[1] Legg til nytt arrangement\n[2] Vis arrangementer på bestemt sted\n[3] Vis arrangementer på bestemt dato\n[4] Vis arrangementer mellom to datoer\n[5] Sorter arrangementer\n[6] Avbryt");
            int valg = in.nextInt();
            in.nextLine();
            if (valg == 1){
                System.out.println("\nSkriv inn tidspunkt: ");
                long tidspunkt = in.nextLong();
                in.nextLine();
                System.out.println("\nSkriv inn navn på arrangement: ");
                String arrNavn = in.nextLine();
                System.out.println("\nSkriv inn sted: ");
                String sted = in.nextLine();
                System.out.println("\nSkriv inn arrangør: ");
                String host = in.nextLine();
                System.out.println("\nSkriv inn type arrangement: ");
                String type = in.nextLine();
                register.opprettArrangement(tidspunkt, arrNavn, sted, host, type);
            } else if (valg == 2){
                System.out.println("\nViser arrangement på sted");
                System.out.println("\nSkriv inn sted som skal søkes etter: ");
                String sted = in.next();
                System.out.println(register.eventsAtLocation(sted).toString());
            } else if (valg == 3) {
                System.out.println("Viser arrangement på bestemt dato: ");
                System.out.println("\nSkriv inn dato: ");
                long dato = in.nextLong();
                System.out.println(register.eventsAtTime(dato).toString());
            } else if (valg == 4){
                System.out.println("\nViser arrangementer mellom to datoer: ");
                System.out.println("\nSkriv inn første dato: ");
                long dato_1 = in.nextLong();
                System.out.println("\nSkriv inn andre dato: ");
                long dato_2 = in.nextLong();
                System.out.println(register.eventsBetweenTime(dato_1, dato_2).toString());
            } else if (valg == 5){
                System.out.println("\nSkriver ut sorterert liste med arrangementer basert på valg: ");
                System.out.println("\n[1] Sorter etter sted\n[2] Sorter etter type\n[3] Sorter etter tidspunkt");
                int valg_0 = in.nextInt();
                System.out.println(register.sortereListe(valg_0).toString());
            } if (valg == 6){
                break;
            }
        }


    }
}
