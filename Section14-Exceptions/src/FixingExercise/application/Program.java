package FixingExercise.application;

import FixingExercise.model.entities.Account;
import FixingExercise.model.exceptions.BusinessException;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        try {
            System.out.println("Enter account data");
            System.out.print("Number: ");
            int number = scan.nextInt();
            System.out.print("Holder: ");
            scan.nextLine();
            String holder = scan.nextLine();
            System.out.print("Initial balance: ");
            double balance = scan.nextDouble();
            System.out.print("Withdraw limit: ");
            double withdrawLimit = scan.nextDouble();

            Account account = new Account(number, holder, balance, withdrawLimit);

            System.out.println();
            System.out.print("Enter amount for withdraw: ");
            double withdrawAmount = scan.nextDouble();

            account.withdraw(withdrawAmount);

            System.out.println("New balance: " + account.getBalance());
        } catch (BusinessException e){
            System.out.println("Withdraw error: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Unexpected error");
        } finally {
            scan.close();
        }
    }
}
