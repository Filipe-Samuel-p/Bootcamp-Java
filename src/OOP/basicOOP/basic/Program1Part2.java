package OOP.basicOOP.basic;

import java.util.Scanner;

public class Program1Part2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Triangle X,Y;
        X = new Triangle();
        Y = new Triangle();

        System.out.println("Enter of sides of triangle X: ");

        X.side1 = input.nextDouble();
        X.side2 = input.nextDouble();
        X.side3 = input.nextDouble();

        System.out.println("Enter of sides of triangle Y: ");

        Y.side1 = input.nextDouble();
        Y.side2 = input.nextDouble();
        Y.side3 = input.nextDouble();

        double areaX = X.area();
        double areaY = Y.area();

        System.out.println("Area od triangle X: " + areaX);
        System.out.println("Area od triangle Y: " + areaY);

        if(areaX > areaY){
            System.out.println("areaX > areaY");
        }
        else{
            System.out.println("areaX < areaY");
        }
        input.close();

    }

}
