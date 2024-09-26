package Unit2;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);

        System.out.print("Coloque um número qualquer: ");
        int number = scan.nextInt();

        if (number < 0) {
            System.out.print("Negativo");
        }else {
            System.out.print("Não Negativo");
        }

        scan.close();
    }
}
