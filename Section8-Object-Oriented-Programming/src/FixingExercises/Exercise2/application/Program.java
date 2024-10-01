package FixingExercises.Exercise2.application;

import FixingExercises.Exercise2.entities.Employee;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.print("Name: ");
        employee.name = scan.nextLine();
        System.out.print("Gross Salary: ");
        employee.grossSalary= scan.nextDouble();
        System.out.print("Tax: ");
        employee.tax = scan.nextDouble();

        System.out.println();
        System.out.print("Employee: " + employee);

        System.out.println();
        System.out.print("Which percentage to increase salary? ");
        employee.increaseSalary(scan.nextDouble());

        System.out.println();
        System.out.print("Updated data: " + employee);

        scan.close();
    }
}
