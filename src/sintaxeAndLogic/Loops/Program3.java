package sintaxeAndLogic.Loops;

import java.util.Scanner;

public class Program3 {
   public static float fatorial(int x) {
      int fat = 1;
       if(x == 0 || x == 1){
           return 1;
       }
       else{
           return x * fatorial(x - 1);
       }
   }

    public static void main(String[] args) {
       // expression = E(n) = 1 + 1/1! + 1/2!... 1/n!
        Scanner sc = new Scanner(System.in);
        System.out.println("enter of number: ");
        int number = sc.nextInt();

        float expression = 1;
        for( int i = 1; i < number + 1; i++)
            expression += 1/fatorial(i);

        System.out.printf("The expression for n = %d is: %f",number,expression);
    }
}
