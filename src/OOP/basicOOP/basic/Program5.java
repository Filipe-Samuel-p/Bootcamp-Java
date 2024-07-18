package OOP.basicOOP.basic;

import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student student = new Student();

        System.out.println("Enter of name: ");
        student.name = input.next();

        System.out.println("enter of num1");
        student.num1 = input.nextDouble();
        System.out.println("enter of num2");
        student.num2 = input.nextDouble();
        System.out.println("enter of num3");
        student.num3 = input.nextDouble();

        student.showStudentData();

        System.out.println("Media " + student.media());
        student.verification();
        input.close();
    }
}
