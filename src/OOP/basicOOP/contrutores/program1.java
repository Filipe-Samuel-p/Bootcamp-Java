package OOP.basicOOP.contrutores;

import OOP.basicOOP.basic.Program1;

import java.util.Scanner;

public class program1 {
    public String name;
    public double price;
    public int quantity;

    //construtor
    public program1(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter product data");
        System.out.println("Name: ");
        String name = input.next();
        System.out.println("Price: ");
        double price = input.nextDouble();
        System.out.println("Quantity in stock: ");
        int quantity = input.nextInt();

        //criando o objeto/contrutor
        program1 product = new program1(name,price,quantity);
        // "obriga" o dev a ja entrar com os dados do objeto
    }

}
