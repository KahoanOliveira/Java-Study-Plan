package Unit1;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int total = 0;

        System.out.print("Coloque o primeiro número:");
        total += scan.nextInt();

        System.out.print("Coloque o segundo número:");
        total += scan.nextInt();

        System.out.println("A soma dos dois números é: " + total);

        scan.close();
    }
}
