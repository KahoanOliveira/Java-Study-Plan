package FixingExercise.application;

import FixingExercise.entities.Client;
import FixingExercise.entities.Order;
import FixingExercise.entities.OrderItem;
import FixingExercise.entities.Product;
import FixingExercise.entities.enums.OrderStatus;

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

        System.out.println("Enter cliente data:");
        System.out.print("Name: ");
        String clientName = scan.nextLine();
        System.out.print("Email: ");
        String clientEmail = scan.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date clientBirthDate = sdf.parse(scan.next());

        Client client = new Client(clientName, clientEmail, clientBirthDate);

        System.out.println("Enter order data:");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(scan.next());

        Order order = new Order(new Date(), status, client);

        System.out.print("How many items to this order? ");
        int n = scan.nextInt();

        for (int i=1; i<=n; i++){
            System.out.println("Enter #" + i + " item data:");
            System.out.print("Product name: ");
            scan.nextLine();
            String productName = scan.nextLine();
            System.out.print("Product price: ");
            double productPrice = scan.nextDouble();
            System.out.print("Quantity: ");
            int productQuantity = scan.nextInt();

            Product product = new Product(productName, productPrice);
            OrderItem orderItem = new OrderItem(productQuantity, productPrice, product);

            order.addItem(orderItem);
        }

        System.out.println();
        System.out.println("ORDER SUMMARY:");
        System.out.print(order);

        scan.close();
    }
}
