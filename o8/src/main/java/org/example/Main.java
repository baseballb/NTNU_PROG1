package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Skriv inn fornavn: \n");
        String fornavn = input.next();
        System.out.println("Skriv inn etternavn \n");
        String etternavn = input.next();
        System.out.println("Skriv inn fødselsår: \n");
        int birthYear = input.nextInt();
        Person person_1 = new Person(fornavn,etternavn,birthYear);
        System.out.println("Skriv inn arbeidstaker-nummer: \n");
        int arbtakernr = input.nextInt();
        System.out.println("Skriv inn ansettelses-år: \n");
        int yearOfHiring = input.nextInt();
        System.out.println("Skriv inn månedslønn: \n");
        double monthlyWage = input.nextDouble();
        System.out.println("Skriv inn skatteprosent i desimalform: \n");
        double skatteprosent = input.nextDouble();

        ArbTaker arbTaker_1 = new ArbTaker(person_1, arbtakernr, yearOfHiring, monthlyWage, skatteprosent);

        while (true){
            System.out.println("Velg en av valgmulighetene ved å skrive inn tall fra 1-4\n[1] Endre på månedslønn\n[2] Endre på skatteprosent\n[3] Skrive ut info\n[4] Avbryt");
            int valg = input.nextInt();
            if (valg == 1){
                System.out.println("Skriv inn ny månedslønn:\n");
                double nyWage = input.nextDouble();
                arbTaker_1.setMonthlyWage(nyWage);
                System.out.println("Ny månedslønn er: " + arbTaker_1.getMonthlyWage());
            }
            if (valg == 2){
                System.out.println(("Skriv inn ny skatteprosent i desimalform:\n"));
                double nySkatteprosent = input.nextDouble();
                arbTaker_1.setSkatteProsent(nySkatteprosent);
                System.out.println("Ny skatteprosent er: " + arbTaker_1.getSkatteProsent());
            }
            if (valg == 3){
                System.out.println(arbTaker_1.lastFirst());
                System.out.println("Alder: " + arbTaker_1.alder());
                System.out.println("Nummer: " + arbTaker_1.getArbtakernr());
                System.out.println("Ansatt siden: " + arbTaker_1.getYearOfHiring());
                System.out.println("Ansatt i: " + arbTaker_1.yearsEmployed() + " år");
                System.out.println("Månedslønn: " + arbTaker_1.getMonthlyWage());
                System.out.println("Skatteprosent: " + arbTaker_1.getSkatteProsent());
                System.out.println("Skattetrekk i måneden: " + arbTaker_1.skatteTrekk());
                System.out.println("Årslønn før skatt: " + arbTaker_1.salary());
                System.out.println("Skattetrekk i året: " + arbTaker_1.yearlyTax());

            }
            if (valg == 4) {
                break;
            }
        }
    }
}