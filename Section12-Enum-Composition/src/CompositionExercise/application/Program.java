package CompositionExercise.application;

import CompositionExercise.entities.Department;
import CompositionExercise.entities.HourContract;
import CompositionExercise.entities.Worker;
import CompositionExercise.entities.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter department's name: ");
        String departmentName = scan.nextLine();
        System.out.println("Enter worker data:");
        System.out.print("Name: ");
        String workerName = scan.nextLine();
        System.out.print("Level: ");
        String workerLevel = scan.nextLine();
        System.out.print("Base Salary: ");
        double workerSalary = scan.nextDouble();
        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), new Department(departmentName), workerSalary);

        System.out.print("How many contracts to this worker? ");
        int n = scan.nextInt();

        for (int i=1; i<=n; i++){
            System.out.println("Enter contract #" + i + " data:");
            System.out.print("Date (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(scan.next());
            System.out.print("Value per hour: ");
            double valuePerHour = scan.nextDouble();
            System.out.print("Duration (hours): ");
            int duration = scan.nextInt();
            HourContract contract = new HourContract(contractDate, duration, valuePerHour);
            worker.addContract(contract);
        }

        System.out.println();
        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = scan.next();
        int month = Integer.parseInt(monthAndYear.substring(0,2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.println("Income for: " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));


        scan.close();
    }
}
