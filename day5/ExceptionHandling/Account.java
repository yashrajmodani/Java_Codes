package day5.ExceptionHandling;

public class Account {
    private static int accNo;
    private String name;
    private double balance;
    private int transaction = 0;

    public Account(String name, double balance) {
        Account.accNo += 1;
        this.name = name;
        this.balance = balance;
    }

    public double deposit(double amount) throws IncorrectDenominationException {

        if (amount % 500 != 0) {
            throw new IncorrectDenominationException("Amount should be multiple of Rs.500");
        }
        else{
            this.balance += amount;
            return this.balance;
        }
    }
    public double withdraw(double amount) throws InsufficientFundException, TransactionLimitExceededException {
        if (amount >= this.balance) {
            throw new InsufficientFundException("Insufficient Balance");
        } else {
            this.transaction += 1;
            if (transaction > 5) {
                throw new TransactionLimitExceededException("You've Reached your Transaction Limit.");
            } else {
                this.balance -= amount;
                return this.balance;
            }
        }
    }
    public String toString(){
        return "Account no.: "+ this.accNo  + "Name: " + this.name +  " Balance: " + this.balance;
    }
}
