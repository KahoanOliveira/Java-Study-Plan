package Unit2;

import java.util.Scanner;

public class Exercise5 {

    static final Double PRECOCOD1 = 4.00;
    static final Double PRECOCOD2 = 4.50;
    static final Double PRECOCOD3 = 5.00;
    static final Double PRECOCOD4 = 2.00;
    static final Double PRECOCOD5 = 1.50;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o código do produto: ");
        int codProd = scan.nextInt();
        System.out.print("Digite a quantidade deste produto: ");
        int qtd = scan.nextInt();

        Double total;
        if (codProd == 1){
            total = qtd * PRECOCOD1;
        } else if (codProd == 2) {
            total = qtd * PRECOCOD2;
        } else if (codProd == 3) {
            total = qtd * PRECOCOD3;
        } else if (codProd == 4) {
            total = qtd * PRECOCOD4;
        } else {
            total = qtd * PRECOCOD5;
        }

        System.out.printf("O total foi de: %.2f", total);

        scan.close();
    }
}
