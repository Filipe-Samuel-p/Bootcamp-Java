package sintaxeAndLogic.estruturaSequencial;

import java.util.Scanner;

public class SixNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number1 = input.nextInt();

        System.out.print("Enter a number: ");
        int number2 = input.nextInt();

        System.out.print("Enter a number: ");
        int number3 = input.nextInt();

        System.out.print("Enter a number: ");
        int number4 = input.nextInt();

        System.out.print("Enter a number: ");
        int number5 = input.nextInt();

        System.out.print("Enter a number: ");
        int number6 = input.nextInt();

        double numerator = (number1 * number2 *number3 *number4 * (2 * number5) * (2 * number6));
        double denominator = 1 + 1 + 1 + 1 + 2 + 2;
        double gradeAverage = numerator / denominator;

        if (gradeAverage >= 6){
            System.out.println("Approved");
        }
        else{
            System.out.println("disapproved");
        }

    }
}
