package Unit2;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o Valor A: ");
        int A = scan.nextInt();
        System.out.print("Digite o Valor B: ");
        int B = scan.nextInt();

        if (A % B == 0 || B % A == 0){
            System.out.print("São Multiplos");
        }else{
            System.out.print("Não São Multiplos");
        }

        scan.close();

    }
}
