package OOP.basicOOP;

import java.util.Scanner;
import OOP.basicOOP.Product;

public class Program2 {
    public static void main(String[] args) {

        Product product = new Product();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter product data");

        System.out.print("Name: ");
        product.name = input.next();

        System.out.print("Price: ");
        product.price= input.nextDouble();

        System.out.print("Quantity: ");
        product.quantity= input.nextInt();
        System.out.printf("Product data: %s, $ %.2f, %d units, total %.2f ", product.name, product.price, product.quantity,product.totalValueInStock());

        System.out.println("\nEnter the number of products to be added in stock: ");
        int newNumber = input.nextInt();
        product.addProducts(newNumber);

        System.out.printf("Update data: %s, $ %.2f, %d units, total %.2f ", product.name, product.price, product.quantity,product.totalValueInStock());
        input.close();
    }
}
