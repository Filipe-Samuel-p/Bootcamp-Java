package OOP.basicOOP.basic;

import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.print("Enter of name: ");
        employee.name = input.next();

        System.out.print("Enter of salary: ");
        employee.grossSalary = input.nextDouble();

        System.out.print("Enter of tax: ");
        employee.tax = input.nextDouble();

        employee.showData();

        System.out.println("\nWhich percentage to increase salary? ");
        double percentage = input.nextDouble();

        employee.finalSalaray(percentage);
        employee.showData();

        input.close();
    }

}
