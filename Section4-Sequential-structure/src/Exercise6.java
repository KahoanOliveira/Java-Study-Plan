import java.util.Scanner;

public class Exercise6 {

    static final Double PI = 3.14159;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;

        System.out.print("Digite o Valor A: ");
        A = scan.nextDouble();
        System.out.print("Digite o Valor B: ");
        B = scan.nextDouble();
        System.out.print("Digite o Valor C: ");
        C = scan.nextDouble();

        triangulo = (A * C) /2;
        circulo = PI * (C * C);
        trapezio = (C * (A + B)) /2;
        quadrado = B * B;
        retangulo = A * B;

        System.out.printf("TRIANGULO: %.3f %n", triangulo);
        System.out.printf("CIRCULO: %.3f %n", circulo);
        System.out.printf("TRAPEZIO: %.3f %n", trapezio);
        System.out.printf("QUADRADO: %.3f %n", quadrado);
        System.out.printf("RETANGULO: %.3f %n", retangulo);



        scan.close();
    }
}
