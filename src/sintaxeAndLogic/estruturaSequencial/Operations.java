package sintaxeAndLogic.estruturaSequencial;
//Prof - Ausberto S. Castro Vera
// UENF - CCT - LCMAT - Ciencia da computacao
//Aluno: Filipe Samuel Pires Dos Santos

import java.util.Scanner;

public class Operations {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number1 = input.nextInt();

        System.out.print("Enter a second number: ");
        int number2 = input.nextInt();

        int mult = number1 * number2;
        double div = (double) number1 /number2;
        int sum = number1 + number2;
        int sub = number1 - number2;

        System.out.println("Filipe Samuel Pires Dos Santos");
        System.out.printf("multiplicacao: %d\n", mult);
        System.out.printf("soma: %d\n", sum);
        System.out.printf("subtração: %d\n", sub);
        System.out.printf("divisão: %f",div );






    }
}
