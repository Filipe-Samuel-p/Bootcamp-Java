package OOP.basicOOP.heranca.entites;

public class SavingsAccount extends Account{

    private Double interestRate;

    public SavingsAccount (){
        super();
    }

    public SavingsAccount(String holder, Double balance, Integer number, Double interestRate) {
        super(holder, balance, number); //chamada para o contrutor da superclasse.
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance(){

    }

    @Override      //indica ao compilador uma sobreposição.
    public void withdraw(double amount){
        balance -= amount;
    }

    /* @Override      //usando a palavra super para sobreposição
    public void withdraw(double amount){
        super.withdraw(amount);
        balance -= 2.0;
    } */
}
