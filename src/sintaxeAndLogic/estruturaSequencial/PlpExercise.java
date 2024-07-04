package sintaxeAndLogic.estruturaSequencial;

//Prof - Ausberto S. Castro Vera
// UENF - CCT - LCMAT - Ciencia da computacao
//Aluno: Filipe Samuel Pires Dos Santos

public class PlpExercise {
    public static void main(String[] args) {

        int a = 576,b = 1592, sum = 0;
        for (int index = a; index <= b; index++){
            sum += index;
        }
        System.out.printf("Sum = %d", sum);
    }
}
