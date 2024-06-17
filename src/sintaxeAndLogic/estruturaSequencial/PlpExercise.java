package sintaxeAndLogic.estruturaSequencial;

public class PlpExercise {
    public static void main(String[] args) {

        int a = 6,b = 20, sum = 0;
        for (int index = a; index <= b; index++){
            sum += index;
        }
        System.out.printf("Sum = %d", sum);
    }
}
