package sintaxeAndLogic.estruturaSequencial;

public class Program01 {

    public static void main(String[] args) {
        // String product1 = "Computer";
        // String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;

        System.out.println("Products: ");
        System.out.println("Computer,which price is $ " + price1);
        System.out.println("Office desk, which price is $ " + price2);
        System.out.printf("Record: %d years old, code %d and gender: %c", age, code, gender);

    }
}