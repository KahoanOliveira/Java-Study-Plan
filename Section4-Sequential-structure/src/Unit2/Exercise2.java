package Unit2;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Coloque algum número: ");
        int number = scan.nextInt();

        int result = number % 2;

        if (result == 0){
            System.out.print("Numero é Par");
        }else {
            System.out.print("Numero é Impar");
        }

        scan.close();
    }
}
