package sintaxeAndLogic.estruturaCondicional;

import java.util.Scanner;

public class program2 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int num1 = sc.nextInt();
        System.out.print("Digite um segundo valor: ");
        int num2 = sc.nextInt();

        if(num1 >= num2){
            System.out.printf("O maior valor é %d", num1);
        }
        else{
            System.out.printf("O maior valor é %d", num2);
        }
        sc.close();
    }
}
