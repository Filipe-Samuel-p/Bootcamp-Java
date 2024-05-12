package sintaxeAndLogic.vetctorAndMatrices;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter of size vector: ");
        int size = input.nextInt();
        int[] vector = new int[size];
        for(int index = 0; index < vector.length;index++){
            System.out.print("Enter a number: ");
            vector[index] = input.nextInt();
        }
        int count= 0;

        for(int index = 0; index < vector.length;index++)
            if(vector[index] < 0){
                System.out.printf("%d", vector[index]);
                count += 1;
        }
        System.out.printf("\nNegative numbers: %d", count);

        input.close();
    }
}
