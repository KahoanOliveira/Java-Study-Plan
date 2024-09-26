package Unit2;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);

        System.out.print("Digite o valor: ");
        Double value = scan.nextDouble();

        if (value >= 0 && value <= 25.00) {
            System.out.println("Intervalo [0,25]");
        } else if (value >= 25.01 && value <= 50.00) {
            System.out.println("Intervalo [25,50]");
        } else if (value >= 50.01 && value <= 75.00) {
            System.out.println("Intervalo [50,75]");
        } else if (value >= 75.01 && value <= 100.00) {
            System.out.println("Intervalo [75,100]");
        } else {
            System.out.println("Fora de intervalo");
        }

            scan.close();
    }
}
