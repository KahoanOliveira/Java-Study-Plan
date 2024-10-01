package FixingExercises.Exercise4.application;

import FixingExercises.Exercise4.util.CurrencyConverter;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double dollarPrice = scan.nextDouble();
        System.out.print("How many dollars will be bought? ");
        double dollarBought = scan.nextDouble();

        System.out.printf("Amount to be paid in reais = %.2f", CurrencyConverter.currencyCalculator(dollarPrice,dollarBought));

        scan.close();
    }
}
