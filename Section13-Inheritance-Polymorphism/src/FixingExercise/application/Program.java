package FixingExercise.application;

import FixingExercise.entities.ImportedProduct;
import FixingExercise.entities.Product;
import FixingExercise.entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter the number of products: ");
        int n = scan.nextInt();
        List<Product> list = new ArrayList<>();

        for (int i=1; i<=n; i++){
            System.out.println();
            System.out.println("Product #"+ i + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char ch = scan.next().charAt(0);
            System.out.print("Name: ");
            scan.nextLine();
            String name = scan.nextLine();
            System.out.print("Price: ");
            double price = scan.nextDouble();

            if (ch == 'i'){
                System.out.print("Customs fee: ");
                double customFee = scan.nextDouble();

                list.add(new ImportedProduct(name,price,customFee));
            } else if (ch == 'u' ) {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                Date manufacturedDate = sdf.parse(scan.next());

                list.add(new UsedProduct(name, price, manufacturedDate));
            }else{
                list.add(new Product(name, price));
            }
        }

        System.out.println("PRICE TAGS: ");
        for (Product prod : list){
            System.out.println(prod.priceTag());
        }

        scan.close();
    }
}
