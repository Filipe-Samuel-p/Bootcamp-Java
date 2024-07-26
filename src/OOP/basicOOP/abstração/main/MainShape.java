package OOP.basicOOP.abstração.main;

import OOP.basicOOP.abstração.entites.Circle;
import OOP.basicOOP.abstração.entites.Color;
import OOP.basicOOP.abstração.entites.Shape;
import OOP.basicOOP.abstração.entites.Rectangle;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class MainShape {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner input = new Scanner(System.in);
        List<Shape> listShape = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int number = input.nextInt();

        for (int index = 0; index < number; index++){
            System.out.print("\nRectangle or Circle (r/c): ");
            char figure = input.next().charAt(0);
            Color color = Color.valueOf(input.next());

            if(figure == 'r'){

                System.out.print("Width: ");
                double wi = input.nextDouble();
                System.out.print("Height: ");
                double hei = input.nextDouble();
                Rectangle rectangle = new Rectangle(color,wi,hei);
                listShape.add(rectangle);
            }
            else if (figure == 'c'){
                System.out.print("Radius: ");
                double rad = input.nextDouble();
                Circle circle = new Circle(color,rad);
                listShape.add(circle);
            }
        }

        System.out.println("SHAPE AREAS: ");
        for (Shape shapes: listShape){
            System.out.println(shapes.area());
        }
    }


}
