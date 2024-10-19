package day10.Acc;

public class Account {
    private double balance;

    public Account(int balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount){
            balance -= amount;
    }

    public void deposit(double amount){
        balance +=amount;

    }

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                '}';
    }
}
