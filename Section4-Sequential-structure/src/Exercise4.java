import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Coloque o seu número de funcionário:");
        int numeroFuncionario = scan.nextInt();

        System.out.print("Coloque o número de horas trabalhadas:");
        int horasTrabalhadas = scan.nextInt();

        System.out.print("Coloque o valor que você recebe por hora:");
        double valorPorHora = scan.nextDouble();

        double salario = horasTrabalhadas * valorPorHora;

        System.out.println("Número de funcionário = " + numeroFuncionario);
        System.out.printf("Salário = U$ %.2f %n", salario);

        scan.close();
    }
}
