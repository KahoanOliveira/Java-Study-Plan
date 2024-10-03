package FixingExercise.application;

import FixingExercise.entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        Account account;

        System.out.print("Enter account number: ");
        int acctNumber = scan.nextInt();
        System.out.print("Enter account holder's name: ");
        scan.nextLine();
        String acctHolder = scan.nextLine();
        System.out.print("Is there na initial deposit (y/n)? ");
        char response = scan.next().charAt(0);

        if (response == 'y'){
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = scan.nextDouble();
            account = new Account(acctNumber, acctHolder, initialDeposit);
        }else{
            account = new Account(acctNumber, acctHolder);
        }

        System.out.println();
        System.out.println("Account data: ");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double depositValue = scan.nextDouble();
        account.deposit(depositValue);
        System.out.println("Updated account data: ");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double withdrawValue = scan.nextDouble();
        account.withdraw(withdrawValue);
        System.out.println("Updated account data: ");
        System.out.println(account);

        scan.close();
    }
}
