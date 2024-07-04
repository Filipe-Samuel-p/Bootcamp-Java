package sintaxeAndLogic.estruturaSequencial;

//Prof - Ausberto S. Castro Vera
// UENF - CCT - LCMAT - Ciencia da computacao
//Aluno: Filipe Samuel Pires Dos Santos

import java.util.Scanner;

public class SixNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] vectorNote = new int[6];

        for (int index = 0; index < vectorNote.length; index++){
            System.out.print("Enter a number: ");
            int number = input.nextInt();
            vectorNote[index] = number;
        }
        double numerator = 0;
        for (int index = 0; index < vectorNote.length; index++){
            if (index <= 3){
                numerator += vectorNote[index];
            }
            else{
                numerator += (2 * vectorNote[index]);
            }
        }

        double denominator = 1 + 1 + 1 + 1 + 2 + 2;
        double gradeAverage = numerator / denominator;

        if (gradeAverage >= 6){
            System.out.printf("Media = %f- Approved",gradeAverage);
        }
        else{
            System.out.printf("Media = %f- disapproved", gradeAverage);
        }

    }
}
