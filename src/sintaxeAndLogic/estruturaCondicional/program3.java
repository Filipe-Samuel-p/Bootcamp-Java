package sintaxeAndLogic.estruturaCondicional;

import java.util.Scanner;

public class program3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o um numero: ");
        double num1 = sc.nextDouble();

        double finalNum = (num1 > 0) ? Math.sqrt(num1): Math.pow(num1, 2); //método pra potenciação

        System.out.println(finalNum);


    }
}
