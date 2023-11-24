package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        Register EiendomsRegister = new Register();


        while (true) {
            System.out.println("[1] Registrer ny eiendom\n[2] Vis alle registrerte eiendommer\n[3] Søk etter eiendom basert på kommunenummer, gårdsnummer og bruksnummer\n[4] Vis gjennomsnittsareal på registrerte eiendommer\n[5] Avbryt");
            int valg = in.nextInt();
            if (valg == 1) {
                System.out.println("\nSkriv inn kommunenummer: ");
                int kommuneNummer = in.nextInt();
                System.out.println("\nSkriv inn gårdsnummer: ");
                int gnr = in.nextInt();
                System.out.println("\nSkriv inn bruksnummer: ");
                int bnr = in.nextInt();
                System.out.println("\nSkriv inn kommunenavn: ");
                in.nextLine();
                String kommuneNavn = in.nextLine();
                System.out.println("\nSkriv inn bruksnavn (Skriv Ingen hvis eiendommen ikke har bruksnavn): ");
                String bruksNavn = "";
                bruksNavn += in.nextLine();
                System.out.println("\nSkriv inn eiernavn: ");
                String eierNavn = in.nextLine();
                System.out.println("\nSkriv inn areal: ");
                double areal = in.nextDouble();

                EiendomsRegister.registrerEiendom(kommuneNummer, gnr, bnr, kommuneNavn, bruksNavn, eierNavn, areal);
                System.out.println("Opprettet eiendom");

            } else if (valg == 2) {
                System.out.println(EiendomsRegister.getEiendommer().toString());
            } else if (valg == 3) {
                System.out.println("\nSkriv inn kommunenummer: ");
                int kommuneNummer = in.nextInt();
                System.out.println("\nSkriv inn gårdsnummer: ");
                int gnr = in.nextInt();
                System.out.println("\nSkriv inn bruksnummer: ");
                int bnr = in.nextInt();
                String kgb = String.valueOf(kommuneNummer) + "-" + String.valueOf(gnr) + "/" + String.valueOf(bnr);

                Eiendom result = EiendomsRegister.finnEiendom(kgb);
                if (result == null){
                    System.out.println("Kunne ikke finne eiendom");
                } else {
                    System.out.println("Funnet eiendom: " + result.toString());
                }
            } else if (valg == 4) {
                System.out.println(EiendomsRegister.averageAreal() + "m^2");
            } else if (valg == 5) {
                break;
            }
        }
    }
}