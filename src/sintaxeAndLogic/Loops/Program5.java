package sintaxeAndLogic.Loops;

import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        // floyd's triangle

        int aux = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of lines:  ");
        int number = sc.nextInt();

        for(int i = 1; i< number + 1; i++) {
            System.out.print("\n");
            for (int j = 0; j < i; j++) {
                aux += 1;
                System.out.print("\t" + aux);
            }
        }

        sc.close();
    }
}
