package OOP.basicOOP;

import java.util.Scanner;

public class Program1 {

    public static double area(float x, float y, float z){
        float P = (x + y + z)/2;
        double operation = P*(P-x)*(P-y)*(P-z);
        double area = Math.sqrt(operation);
        return area;
    }
    public static void main(String[] args) {
        // no OOP first
        // Escreva um programa que leia os lados de 2 triangulos: X e Y, e calcule a area com
        // a formula de heron A= sqrt(P(P-A)(P-B)(P-C)

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter of side value of triangle X: ");
        float x1 = sc.nextFloat();
        float x2 = sc.nextFloat();
        float x3 = sc.nextFloat();

        double areaX = area(x1, x2 ,x3);

        System.out.println("Enter of side value of triangle Y: ");
        float y1 = sc.nextFloat();
        float y2 = sc.nextFloat();
        float y3 = sc.nextFloat();

        double areaY = area(y1,y2,y3);
        System.out.println("The area of triangle X is " + areaX);
        System.out.println("The area of triangle Y is " + areaY);
        if(areaX > areaY){
            System.out.println("areaX > areaY");
        }
        else{
            System.out.println("areaX < areaY");
        }

        sc.close();
    }
}
