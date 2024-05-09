package sintaxeAndLogic.functions;

import java.util.Scanner;

public class Program1 {

    public static void perfectSquare(int number){
        if(number > 0){
            double x = Math.sqrt(number);
            if(x ==(int) x){
                System.out.println("Perfect square");
            }
            else{
                System.out.println("Not a perfect square");
            }
        }
        else{
            System.out.println("Enter a positive number!!");
        }
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int y = input.nextInt();
        perfectSquare(y);
        input.close();
    }
}
