package FixingExercises.Exercise1.application;

import FixingExercises.Exercise1.entities.Number;

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

        for (int i=0; i<number.length;i++){
            System.out.print("Digite um numero: ");
            int num = scan.nextInt();
            number[i] = new Number(num);
        }

        System.out.println("Numeros negativos: ");

        for (int i=0; i< number.length; i++){
            if (number[i].getNum() < 0){
                System.out.printf("%d\n", number[i].getNum());
            }
        }

        scan.close();
    }
}
