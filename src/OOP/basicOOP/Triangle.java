package OOP.basicOOP;

public class Triangle {

    public double side1;
    public double side2;
    public double side3;

    public double area(){
        double P = (side1+side2+side3)/2;
        double expression = P*(P-side1)*(P-side2)*(P-side3);
        return Math.sqrt(expression);
    }
}

