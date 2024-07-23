package OOP.basicOOP.heranca.entites;

public abstract class Account {

    private Integer number;
    private String holder;
    protected Double balance;

    public Account(){

    }

    public Account(String holder, Double balance, Integer number) {
        this.holder = holder;
        this.balance = balance;
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public void withdraw(double amount){
        balance -= amount + 5.0;
    }

    public void deposit (double amount){
        balance += amount;
    }


}
