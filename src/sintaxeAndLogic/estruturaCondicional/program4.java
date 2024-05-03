package sintaxeAndLogic.estruturaCondicional;

import java.util.Scanner;

public class program4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a integer number: ");
        int number = sc.nextInt();
        if (number % 2 == 0){
            System.out.println("the number is even number ");
        }
        else{
            System.out.println("the number is odd number");
        }
        sc.close();
    }
}
