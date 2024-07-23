package OOP.basicOOP.herancaEpolimorfismo.entites;


//herança
public class BusinessAccount extends Account {
    private Double loanLimit;

    public BusinessAccount (){

    }

    public BusinessAccount(String holder, Double balance, Integer number, Double loanLimit) {
        super(holder, balance, number); //O super é o construtor da Super classe, ou seja, da classe onde os dados
                                        // são herdados
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(double amount){
        if(amount <= loanLimit){
            deposit(amount);
        }
    }
}
