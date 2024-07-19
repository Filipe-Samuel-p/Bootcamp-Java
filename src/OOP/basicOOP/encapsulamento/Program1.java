package OOP.basicOOP.encapsulamento;
// padrão para implementação de getters e setters

public class Program1 {
    private String name;
    private Double price;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getPrice (){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }
}
