package OOP.basicOOP.heranca.main;

import OOP.basicOOP.heranca.entites.Employee;
import OOP.basicOOP.heranca.entites.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainEmployee {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int number = input.nextInt();

        List<Employee> listEmployee = new ArrayList<>();

        for(int index = 0; index < number; index++){
            System.out.printf("Name employee %d: ", index + 1);
            String name = input.next();
            System.out.print("Outsources (y/n): ");
            char ch = input.next().charAt(0);
            System.out.printf("Hours employee %d: ", index + 1);
            Integer hours = input.nextInt();
            System.out.printf("Value per hour employee %d: ", index + 1);
            Double valuePerHour = input.nextDouble();

            if(ch == 'y'){
                double additionalCharge = input.nextDouble();
                Employee emp = new OutsourcedEmployee(name,hours,valuePerHour,additionalCharge);
                listEmployee.add(emp);
            }
            else{
                Employee emp = new Employee(name,hours,valuePerHour);
                listEmployee.add(emp);
            }


        }

        for(Employee emp: listEmployee){
            System.out.println("O nome do funcionário: " + emp.getName());
            System.out.println("O pagamento: " + emp.payment());
        }



    }
}
