package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Valuta dollar = new Valuta(1);
        Valuta euro = new Valuta(2);
        Valuta svenskeKroner = new Valuta(3);

        while(true){
            System.out.println("Hvilken valuta?: \n1: Dollar\n2: Euro\n3: Sek\n4: Avslutt");
            int brukerValg = in.nextInt();
            if (brukerValg == 1){
                System.out.println("Skriv inn hvor mange dollar: ");
                double usd = in.nextDouble();
                double nok = usd * dollar.getKurs();
                System.out.println(nok + " kroner");
            } else if (brukerValg == 2) {
                System.out.println("Skriv inn hvor mange euro: ");
                double eur = in.nextDouble();
                double nok = eur * euro.getKurs();
                System.out.println(nok + " kroner");
            } else if (brukerValg == 3) {
                System.out.println("Skriv inn hvor mange sek: ");
                double sek = in.nextDouble();
                double nok = sek * svenskeKroner.getKurs();
                System.out.println(nok + " kroner");
            } else {
                break;
            }
        }

    }
}