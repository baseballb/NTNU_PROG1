package org.example;

public class Main {
    public static void main(String[] args) {

        for (int i = 0; i < 20; i++){
            MinRandom random_1 = new MinRandom();
            System.out.println(random_1.nesteHeltall(10,21));
        }
        for (int i = 0; i < 20; i++){
            MinRandom random_1 = new MinRandom();
            System.out.println(random_1.nesteDesimaltall(0.3,0.7));
        }
    }
}