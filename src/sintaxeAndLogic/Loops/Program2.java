package sintaxeAndLogic.Loops;

import java.util.Scanner;

public class Program2 {

    public static void bubbleSort(int[] vet){
        int aux;
        boolean change = true;
        while(change){
            change = false;
            for(int i = 0; i<4; i++){
                if(vet[i] > vet[i + 1]){
                    aux = vet[i];
                    vet[i] = vet[i+1];
                    vet[i + 1] = aux;
                    change = true;
                }
            }
            if (!change){
                break;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vector = new int[5];
        for(int i = 0; i < 5; i++){
            System.out.printf("enter of %d- number: ", i + 1);
            int number = sc.nextInt();
            vector[i] = number;
        }
        bubbleSort(vector);
        System.out.printf("the smallest value is %d and the highest value is %d", vector[0], vector[4]);

        sc.close();
    }
}
