import java.util.Arrays;
import java.util.Scanner;

public class program1 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int minutos;
        double valorPago, valorBasico = 50.00;
        System.out.print("Digite a quantidade em minutos gasto em ligacao: ");
        minutos = sc.nextInt();
        if(minutos <= 100){
            System.out.print("O valor a ser pago é " + valorBasico);
        }
        else{
            int novoValor = (minutos - 100) * 2;
            System.out.print("voce excedeu o tempo limite, o valor a ser pago é " + (novoValor + valorBasico));
        }



        sc.close();
    }
}