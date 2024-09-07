package OOP.basicOOP.heranca.main;

import OOP.basicOOP.heranca.entites.Animal;
import OOP.basicOOP.heranca.entites.Mamiferos;
import OOP.basicOOP.heranca.entites.Peixes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainAnimais {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        List<Animal> animaisLista = new ArrayList<>();

        System.out.println("Camelo\n");;

        System.out.print("Nome: ");
        String name = input.next();
        System.out.print("Comprimento: ");
        double compri = input.nextDouble();
        System.out.print("Número de patas: ");
        int numPatas = input.nextInt();
        System.out.print("Ambiente: ");
        String ambiente = input.next();
        System.out.print("Velocidade: ");
        double vel = input.nextDouble();

        //polimorfismo:
        Mamiferos camelo = new Mamiferos(compri, ambiente,name,numPatas,vel,"alface");
        animaisLista.add(camelo);

        System.out.println("Tubarao \n");

        System.out.print("Nome: ");
        String name2 = input.next();
        System.out.print("Comprimento: ");
        double compri2 = input.nextDouble();
        System.out.print("Número de patas: ");
        int numPatas2 = input.nextInt();
        System.out.print("Ambiente: ");
        String ambiente2 = input.next();
        System.out.print("Velocidade: ");
        double vel2 = input.nextDouble();
        System.out.print("Caracteristicas: ");
        String carac = input.next();

        Peixes tubarao = new Peixes(compri2,ambiente2,name2,numPatas2,vel2,carac);
        animaisLista.add(tubarao);

        System.out.println("LISTA: \n");
        for (Animal animais: animaisLista){
            animais.dados();
        }

    }

}
