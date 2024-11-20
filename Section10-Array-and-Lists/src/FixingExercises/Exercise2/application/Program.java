package FixingExercises.Exercise2.application;

import FixingExercises.Exercise2.entities.Number;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int n;

        System.out.print("Quantos numeros você vai digitar? ");
        n = scan.nextInt();

        Number[] number = new Number[n];

        for (int i=0; i<number.length; i++){
            System.out.print("Digite um numero: ");
            double num = scan.nextDouble();
            number[i] = new Number(num);
        }

        double soma = 0.0;
        for (int i=0; i<number.length; i++){
            soma += number[i].getNum();
        }

        double media = soma / number.length;

        System.out.print("VALORES = ");

        for (int i=0; i<number.length; i++) {
            System.out.printf("%.1f  ", number[i].getNum());
        }

        System.out.printf("\nSOMA = %.2f\n", soma);
        System.out.printf("MEDIA = %.2f\n", media);

        scan.close();
    }
}
