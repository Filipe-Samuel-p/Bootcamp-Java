package OOP.basicOOP;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock(){
        return quantity * price;
    }
    public void addProducts(int quantity){
        this.quantity += quantity; // o this é usado para referenciar o próprio objeto.
                                   // em outras palavras, o this esta referenciando o atributo quantity e não o parametro da funcao
    }
    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }

}
