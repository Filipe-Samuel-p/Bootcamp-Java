package contrutores;

public class Sobrecarga {

    public String name;
    public double price;
    public int quantity;


    //construtor
    public Sobrecarga(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    //sobrecarga
    public Sobrecarga(String name, double price){
        this.name = name;
        this.price = price;
    }

}
