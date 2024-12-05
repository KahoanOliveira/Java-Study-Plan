package Example.application;

import Example.entities.Account;
import Example.entities.BusinessAccount;
import Example.entities.SavingsAccount;

import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Account acc = new Account(0.0, "Alex", 1001);
        BusinessAccount bcc = new BusinessAccount(0.0,"Maria",1002,500.0);

        // UpCasting
        Account acc1 = bcc;
        Account acc2 = new BusinessAccount(0.0,"Bob",1003,200.0);
        Account acc3 = new SavingsAccount(0.0,"Anna",1004,0.01);

        // DownCasting
        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.0);

        //BusinessAccount acc5 = (BusinessAccount) acc3;

        if (acc3 instanceof BusinessAccount){
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        }

        if (acc3 instanceof SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }
    }
}
