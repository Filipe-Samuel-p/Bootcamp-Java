package OOP.basicOOP.abstração.entites;

public abstract class Contributor {

    private String name;
    private Double annualIncome;

    public Contributor(){}

    public Contributor(Double annualIncome, String name) {
        this.annualIncome = annualIncome;
        this.name = name;
    }

    public Double getAnnualIncome() {
        return annualIncome;
    }

    public void setAnnualIncome(Double annualIncome) {
        this.annualIncome = annualIncome;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double tax();
}
