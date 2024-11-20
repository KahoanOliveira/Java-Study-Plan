package FixingExercises.Exercise3.application;

import FixingExercises.Exercise3.entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int n;

        System.out.print("Quantas pessoas serão digitadas? ");
        n = scan.nextInt();

        Pessoa[] pessoa = new Pessoa[n];

        int numPessoa = 1;
        for (int i=0; i<pessoa.length; i++){
            System.out.println("Dados da " + numPessoa + "a pessoa:");
            scan.nextLine();
            System.out.print("Nome: ");
            String nome = scan.nextLine();
            System.out.print("Idade: ");
            int idade = scan.nextInt();
            System.out.print("Altura: ");
            double altura = scan.nextDouble();
            pessoa[i] = new Pessoa(nome,idade,altura);
            numPessoa++;
        }

        double somaAltura = 0.0;
        for (int i=0; i<pessoa.length; i++){
            somaAltura += pessoa[i].getAltura();
        }

        double mediaAltura = somaAltura / pessoa.length;
        System.out.printf("Altura média: %.2f\n", mediaAltura);

        System.out.println("Pessoas com menos de 16 anos: ");
        for (int i=0; i<pessoa.length; i++){
            if (pessoa[i].getIdade() < 16){
                System.out.println(pessoa[i].getName());
            }
        }

        scan.close();
    }
}
