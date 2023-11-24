package org.example;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        java.util.Random random = new java.util.Random();

        int[] antall = new int[10];

        for (int i = 0; i < 1000; i++){
            int tall = random.nextInt(10);
            antall[tall] += 1;
        }
        System.out.println(Arrays.toString(antall));
    }
}