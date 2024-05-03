package sintaxeAndLogic.estruturaCondicional;

import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int number1 = sc.nextInt();
        System.out.print("enter a second number: ");
        int number2 = sc.nextInt();
        System.out.println("**** OPTIONS ****");
        System.out.println("[1] - sum of numbers");
        System.out.println("[2] - difference in numbers");
        System.out.println("[3] - product of numbers");
        System.out.println("[4] - division of numbers\n");
        System.out.print("Choose an option");
        int option = sc.nextInt();

        switch (option){

            case 1:
                System.out.println("the sum of the numbers is:  " + (number1 + number2));
                break;
            case 2:
                int difference = (number1 >= number2) ? (number1 - number2): (number2 - number1);
                System.out.println("The difference of the numbers is: " + difference);
                break;
            case 3:
                System.out.println("The product of the numbers is: " + (number1 * number2));
                break;
            case 4:
                if(number1 != 0 || number2 != 0){
                    System.out.println("The division of the numbers is " + (number1/number2));
                }
                else if (number2 == 0){
                    System.out.println("there's no division by zero");
                }
                break;
            default:
                System.out.println("you didn't choose an option");
                break;
        }
        sc.close();
    }
}
