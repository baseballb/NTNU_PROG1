package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Tekstbehandler test = new Tekstbehandler("daba daba. ikke dood daba iste, best blin");

        System.out.println("antall ord: " + test.lengde());
        System.out.println("gjennomsnitt antall bokstaver per ord: " + test.gjennomsnittAntall());
        System.out.println("gjennomsnittelig mengde ord per periode: " + test.periodeGjennomsnitt());
        System.out.println(test.byttet("daba", "yaba"));
        System.out.println(test.getTekst());
        System.out.println(test.storeBokstaver());
    }
}