package OOP.basicOOP;

import java.util.Scanner;
import OOP.basicOOP.Rectangle;

public class program3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();

        System.out.print("Enter of width: ");
        rectangle.width = input.nextDouble();

        System.out.print("Enter of height: ");
        rectangle.height = input.nextDouble();

        System.out.printf("The area %.2f, perimeter %.2f  and diagonal %.2f", rectangle.area(), rectangle.perimeter(),rectangle.diagonal());

    }
}
