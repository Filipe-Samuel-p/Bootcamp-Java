package sintaxeAndLogic.vetctorAndMatrices;

import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter of size vector: ");
        int size = input.nextInt();
        double[] vector = new double[size];

        double sum = 0, media = 0;

        for(int index = 0;index < vector.length;index++){
            System.out.print("Enter of number: ");
            vector[index]= input.nextDouble();
            sum += vector[index];
            media = sum/vector.length;
        }
        System.out.print("Valores: ");
        for(int index = 0;index < vector.length;index++){
            System.out.print("\t");
            System.out.printf("%.2f", vector[index]);
        }
        System.out.printf("\nSOMA: %.2f\n",sum);
        System.out.printf("MEDIA %.2f", media);
        input.close();
    }
}
