package sintaxeAndLogic.vetctorAndMatrices;

import java.util.Scanner;

public class AlturaMediaP1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double cout = 0;
        System.out.print("Enter of size vector: ");
        int size = input.nextInt();
        double[] vector= new double[size];
        for(int index = 0; index < size; index++){
            System.out.printf("Enter height of person %d: ", index + 1);
            vector[index] = input.nextDouble();
            cout += vector[index];
        }
        double media = cout/size;
        System.out.printf("Media: %.2f", media);


        input.close();
    }
}
