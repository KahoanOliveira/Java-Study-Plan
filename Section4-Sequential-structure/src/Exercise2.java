import java.util.Scanner;

public class Exercise2 {

    static final Double PI = 3.14159;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Coloque o raio do círculo: ");
        Double raio = scan.nextDouble();

        Double area = PI * (raio * raio);

        System.out.printf("A área do círculo é: %.4f %n", area);

        scan.close();
    }
}
