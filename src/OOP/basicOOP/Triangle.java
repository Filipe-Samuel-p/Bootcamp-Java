package OOP.basicOOP;

public class Triangle {

    public double side1;
    public double side2;
    public double side3;

    public double area(double a, double b, double c){
        double P = (a+b+c)/2;
        double expression = P*(P-a)*(P-b)*(P-c);
        double heron = Math.sqrt(expression);
        return heron;
    }
}

