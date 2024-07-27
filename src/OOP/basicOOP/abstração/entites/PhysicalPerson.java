package OOP.basicOOP.abstração.entites;

public class PhysicalPerson extends Contributor{

    private Double healthExpenses;

    public PhysicalPerson(){
        super();
    }

    public PhysicalPerson(Double annualIncome, String name, Double healthExpenses) {
        super(annualIncome, name);
        this.healthExpenses = healthExpenses;
    }

    public Double getHealthExpenses() {
        return healthExpenses;
    }

    public void setHealthExpenses(Double healthExpenses) {
        this.healthExpenses = healthExpenses;
    }

    @Override
    public double tax() {
        if(getAnnualIncome() < 20000){
            return (getAnnualIncome()* 0.15) - healthExpenses * 0.50;
        }
        else{
           return getAnnualIncome()*0.25 - healthExpenses * 0.50;
        }
    }
}
