package OOP.basicOOP.abstração.main;

import OOP.basicOOP.abstração.entites.Contributor;
import OOP.basicOOP.abstração.entites.PhysicalPerson;
import OOP.basicOOP.abstração.entites.LegalPerson;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;


public class MainContributor {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Contributor> listContributor = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int number = input.nextInt();

        for(int index = 1; index < number + 1; index++){
            System.out.printf("\nTAX PAYER #%d data: \n",index);

            System.out.print("Individual or company (i/c)?: ");
            char verification = input.next().charAt(0);

            System.out.print("Name: ");
            String name = input.nextLine();
            System.out.print("Anual income: ");
            double anualIncome = input.nextDouble();

            if(verification == 'i'){
                System.out.print("Health expenditure: ");
                double healEx = input.nextDouble();
                listContributor.add(new PhysicalPerson(anualIncome,name,healEx));
            }
            else if (verification == 'c'){
                System.out.print("Number of employees: ");
                int numberEmployees = input.nextInt();
                listContributor.add(new LegalPerson(anualIncome,name,numberEmployees));
            }

        }

        Double totalTaxes = 0.0;
        System.out.println("\nTAXES PAID: \n");
        for(Contributor contributor:listContributor){
            System.out.printf("%s: %.2f", contributor.getName(), contributor.tax());
            totalTaxes += contributor.tax();
        }

        System.out.printf("\n TOTAL TAXES: $%f", totalTaxes);
        input.close();
    }

}
