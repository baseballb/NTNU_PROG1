package org.example;

import java.util.Scanner;

public class oppgave2 {
    public static void main(String[] args){
        Scanner brukerTall = new Scanner(System.in);
        System.out.println("Skriv inn tallet du vil sjekke om er et primtall: ");
        int testTall = brukerTall.nextInt();
        for (int i = testTall - 1; i > 0; i--){
            if ((i != 1)){
                int resteRegning = testTall % i;
                if (resteRegning == 0){
                    System.out.println(testTall + " er ikke et primtall da det f.eks kan deles på " + i);
                    break;
                }
            } else {
                System.out.println(testTall + " er et primtall");
            }
        }
    }
}
