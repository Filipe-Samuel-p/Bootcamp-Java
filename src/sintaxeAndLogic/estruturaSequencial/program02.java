import java.util.Scanner;

public class program02 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in); //objeto que faz o input

        String x;
        int idade;
        System.out.print("Digite o seu nome: ");
        x = sc.next(); // usa o metodo next() para indicar que a variavel x  irá receber um valor do teclado
        System.out.printf("O seu nome é: %s \n", x);
        System.out.print("Digite a sua idade: ");
        idade = sc.nextInt();
        System.out.println("A sua idade é: " + idade);





        sc.close();
    }
}