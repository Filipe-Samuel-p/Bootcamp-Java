package sintaxeAndLogic.estruturaSequencial;

import java.util.Scanner;

public class Operations {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number1 = input.nextInt();

        System.out.print("Enter a second number: ");
        int number2 = input.nextInt();

        int mult = number1 * number2;
        double div = (double) number1 /number2;
        int sum = number1 + number2;
        int sub = number1 - number2;

        System.out.printf("%d\n", mult);
        System.out.printf("%d\n", sum);
        System.out.printf("%d\n", sub);
        System.out.printf("%f",div );






    }
}
