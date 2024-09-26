package Unit1;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int A, B, C, D, diff;

        A = scan.nextInt();
        B = scan.nextInt();
        C = scan.nextInt();
        D = scan.nextInt();

        diff = (A * B - C * D);

        System.out.println("DIFERENCA = " + diff);

        scan.close();
    }
}
