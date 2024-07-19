package OOP.basicOOP.encapsulamento;

import java.util.Scanner;

public class Employee {

    private String name;
    private String surname;
    private double salary;

    //construtor
    public Employee(String name, String surname, double salary){
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    //métodos get

    public String getName(){
        return name;
    }

    public String getSurname(){
        return surname;
    }
    public double getSalary(){
        return salary;
    }

    // métodos set
    public void setName(String name){
        this.name = name;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    // método main

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a name: ");
        String name1 = input.next();
        System.out.println("Enter a surname: ");
        String surname1 = input.next();
        System.out.println("Enter salary: ");
        double salary1 = input.nextDouble();

        Employee employee1 = new Employee(name1,surname1,salary1);
        // Teste 1
        System.out.println("Name: " + employee1.getName());
        System.out.println("Surname: " + employee1.getSurname());
        System.out.println("Salary: " + employee1.getSalary() );

        //Teste 2

        System.out.println("Enter a new name: ");
        String name2 = input.next();
        employee1.setName(name2);

        System.out.println("Enter a new salary: ");
        double salary2 = input.nextDouble();
        employee1.setSalary(salary2);

        System.out.println("Name: " + employee1.getName());
        System.out.println("Surname: " + employee1.getSurname());
        System.out.println("Salary: " + employee1.getSalary());


    }
}
