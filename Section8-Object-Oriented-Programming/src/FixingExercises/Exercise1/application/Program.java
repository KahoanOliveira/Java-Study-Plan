package FixingExercises.Exercise1.application;

import FixingExercises.Exercise1.entities.Rectangle;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();

        System.out.println("Enter rectangle width and height");
        System.out.print("Width: ");
        rectangle.width = scan.nextDouble();
        System.out.print("Height: ");
        rectangle.height = scan.nextDouble();

        System.out.println("Area = " + rectangle.area());
        System.out.println("Perimeter = " + rectangle.perimeter());
        System.out.println("Diagonal = " + rectangle.diagonal());

        scan.close();
    }
}
