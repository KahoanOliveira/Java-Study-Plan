package FixingExercises.Exercise3.application;

import FixingExercises.Exercise3.entities.Student;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Student student = new Student();

        System.out.print("Name: ");
        student.name = scan.nextLine();
        System.out.print("Point from the first trimester: ");
        student.firstTrimester = scan.nextDouble();
        System.out.print("Point from the second trimester: ");
        student.secondTrimester = scan.nextDouble();
        System.out.print("Point from the third trimester: ");
        student.thirdTrimester = scan.nextDouble();

        System.out.printf("FINAL GRADE: %.2f%n", student.finalGrade());
        if (student.finalGrade() < 60.0) {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n", student.missingPoints());
        }
        else {
            System.out.println("PASS");
        }

        scan.close();
    }
}
