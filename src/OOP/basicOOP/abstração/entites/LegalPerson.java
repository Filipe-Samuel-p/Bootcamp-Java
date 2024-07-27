package OOP.basicOOP.abstração.entites;

public class LegalPerson extends Contributor{

    private Integer numberOfEmployees;

    public LegalPerson(){
        super();
    }

    public LegalPerson(Double annualIncome, String name, Integer numberOfEmployees) {
        super(annualIncome, name);
        this.numberOfEmployees = numberOfEmployees;
    }

    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public double tax() {
        if(numberOfEmployees > 10){
            return (getAnnualIncome()* 0.14);
        }
        else{
            return (getAnnualIncome() * 0.16);
        }
    }
}
