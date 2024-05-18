package sintaxeAndLogic.vetctorAndMatrices;

import java.util.Random;
import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
       Random rand = new Random();
       Scanner input = new Scanner(System.in);

       int maxNumber = 100;
       System.out.print("Enter of size of vector: ");
       int size = input.nextInt();
       int[] vector = new int[size];
       for(int index = 0; index < vector.length; index++){
           vector[index] = rand.nextInt(maxNumber);
       }
       for(int element: vector){
           System.out.println(element);
       }

    }
}
