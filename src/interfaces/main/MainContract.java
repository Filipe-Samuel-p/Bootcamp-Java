package interfaces.main;

import interfaces.entites.Contract;
import interfaces.entites.Installment;
import interfaces.services.ContractService;
import interfaces.services.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class MainContract {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Entre com os dados do contrato: ");
        System.out.print("Numero: ");
        int number = input.nextInt();
        LocalDate date = LocalDate.parse(input.next(), fmt);
        System.out.print("Valor do contrato: ");
        double totalValue = input.nextDouble();

        Contract contract = new Contract(number,date,totalValue);
        System.out.print("Entre com o número de parcelas: ");
        int n = input.nextInt();

        ContractService contractService = new ContractService(new PaypalService());
        contractService.processContract(contract,n);

        System.out.println("PARCELAS: ");
        for(Installment installment: contract.getIntalments()){
            System.out.println(installment);
        }

        input.close();
    }
}
