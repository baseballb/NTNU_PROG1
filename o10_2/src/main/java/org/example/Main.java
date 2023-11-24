package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Menyregister register = new Menyregister();


        register.registrerRett("Pizza", "Hovedrett", 180);
        register.registrerRett("Oreokake", "Dessert", 89);
        register.registrerRett("Lasagne", "Hovedrett", 160);
        register.registrerRett("Salat", "Forrett", 90);
        register.registrerRett("Bruschetta", "Forrett", 75);
        register.registrerRett("Iskrem", "Dessert", 70);
        register.registrerRett("Burger", "Hovedrett", 160);

        System.out.println(register.finnRett("Pizza").toString());

        System.out.println(register.finnRetterMedType("Dessert"));

        while(true){
            System.out.println("[1] Registrere ny meny\n[2] Menyer med totalpris innefor intervall\n[3] Avbryt");
            int valg = in.nextInt();
            if (valg == 1){
                register.registrerMeny();
            } else if (valg == 2) {
                System.out.println("Skriv inn nedre grense: ");
                double nedre_grense = in.nextDouble();
                System.out.println("Skriv inn øvre grense: ");
                double ovre_grense = in.nextDouble();
                System.out.println(register.finnMenyerInnenforPris(nedre_grense,ovre_grense).toString());
            } else{
                break;
            }
        }



        System.out.println(register.getMenyer().toString());
    }
}