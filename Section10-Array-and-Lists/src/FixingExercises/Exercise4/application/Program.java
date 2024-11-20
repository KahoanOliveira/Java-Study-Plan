package FixingExercises.Exercise4.application;

import FixingExercises.Exercise3.entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int n, qtdPar;

        System.out.print("Quantos numeros voce vai digitar? ");
        n = scan.nextInt();

        int[] numero = new int[n];
        for (int i=0; i<numero.length; i++){
            System.out.print("Digite um numero: ");
            numero[i] = scan.nextInt();
        }

        qtdPar = 0;
        System.out.println("NUMEROS PARES:");
        for (int i=0; i<numero.length; i++){
            if (numero[i] % 2 == 0){
                System.out.printf("%d  ", numero[i]);
                qtdPar++;
            }
        }

        System.out.printf("\nQUANTIDADE DE PARES = " + qtdPar);

        scan.close();
    }
}
