import java.util.Scanner;

public class oppgave1 {
    public static void main(String[] args) {
        Scanner brukerTall = new Scanner(System.in);
        System.out.println("Skriv inn første tall");
        int firstNumber = brukerTall.nextInt();
        System.out.println("Skriv inn andre tall");
        int lastNumber = brukerTall.nextInt();
        System.out.println("Første tall: " + firstNumber + " Andre tall: " + lastNumber);
        int differanse = lastNumber - firstNumber;

        if (differanse >= 0) {
            for (int i = firstNumber; i <= lastNumber; i++) {
                for (int n = 1; n <= 10; n++) {
                    System.out.println(i + " x " + n + " = " + i * n);
                }
                System.out.println("");
            }
        }else{
            System.out.println("Det første tallet må være et tall og være mindre enn det andre tallet");
        }
    }
}