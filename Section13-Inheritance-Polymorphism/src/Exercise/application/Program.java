package Exercise.application;

import Exercise.entities.Employee;
import Exercise.entities.OutsourcedEmployee;

import java.util.*;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int n = scan.nextInt();

        List<Employee> list = new ArrayList<>();

        for (int i=1; i<=n; i++) {
            System.out.println();
            System.out.println("Employee #" + i + " data: ");
            System.out.print("Outsourced (y/n)? ");
            char ch = scan.next().charAt(0);
            System.out.print("Name: ");
            scan.nextLine();
            String name = scan.nextLine();
            System.out.print("Hours: ");
            int hours = scan.nextInt();
            System.out.print("Value per Hour: ");
            double valuePerHour = scan.nextDouble();

            if (ch == 'y'){
                System.out.print("Additional charge: ");
                double addCharge = scan.nextDouble();
                list.add(new OutsourcedEmployee(name, hours, valuePerHour, addCharge));
            }else {
                list.add(new Employee(name, hours, valuePerHour));
            }
        }

        System.out.println("PAYMENTS:");
        for (Employee obj : list) {
            System.out.println(obj);
        }


        scan.close();
    }
}
