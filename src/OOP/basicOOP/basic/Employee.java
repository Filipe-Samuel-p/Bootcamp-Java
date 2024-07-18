package OOP.basicOOP.basic;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary(){
        return grossSalary - tax;
    }

    public void finalSalaray(double percentage){
        double newValue = (grossSalary * percentage/100) + grossSalary;
        this.grossSalary = newValue;
    }

    public void showData(){
        System.out.printf("\nEmployee: %s, salary $ %.2f", this.name, this.netSalary());
    }

}
