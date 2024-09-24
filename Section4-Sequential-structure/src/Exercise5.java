import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print( "Coloque o código da primeira peça: ");
        int codPeca1 = scan.nextInt();
        System.out.print( "Coloque a quantidade da primeira peça: ");
        int qtdPeca1 = scan.nextInt();
        System.out.print( "Coloque o valor da primeira peça: ");
        Double valorPeca1 = scan.nextDouble();

        System.out.print( "Coloque o código da segunda peça: ");
        int codPeca2 = scan.nextInt();
        System.out.print( "Coloque a quantidade da segunda peça: ");
        int qtdPeca2 = scan.nextInt();
        System.out.print( "Coloque o valor da segunda peça: ");
        Double valorPeca2 = scan.nextDouble();

        Double total = (qtdPeca1 * valorPeca1) + (qtdPeca2 * valorPeca2);

        System.out.printf("VALOR A PAGAR: R$ %.2f %n", total);

        scan.close();
    }
}
