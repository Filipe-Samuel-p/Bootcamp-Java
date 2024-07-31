package tryCatch;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        try {
            String[] vector = input.nextLine().split(" ");
            int position = input.nextInt();
            System.out.println(vector[position]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error index");
        }
        System.out.println("O programa continua mesmo após o erro.");


        input.close();
    }
}
