package sintaxeAndLogic.vetctorAndMatrices;

import java.util.Scanner;

public class EvenNumbersProgram4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter of size vector: ");
        int size = input.nextInt();
        int[] vector = new int[size];

        for(int i= 0; i<vector.length;i++){
            System.out.print("Enter a number: ");
            vector[i]=input.nextInt();
        }
        int evenNumbers = 0;
        System.out.print("VALORES: ");
        for (int j : vector) { // for-each-loop -> é um for aprimorado. nao precisa percorrer os indices,
            System.out.print("\t"); // ele ja te passa os valores da matriz/ vetor
            if (j % 2 == 0) {
                System.out.printf("%d", j);
                evenNumbers += 1;
            }
        }
        System.out.println("\n Even numbers: " + evenNumbers);

        input.close();
    }
}
