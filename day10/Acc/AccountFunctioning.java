package day10.Acc;


public class AccountFunctioning {
    Account acc = new Account(1000);
    boolean hasValue = false;

    public synchronized void withdraw(double value){
        if(hasValue){
            try{
                System.out.println("Insufficient Balance");
                wait();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        acc.withdraw(value);
        hasValue= true;
        notify();
        System.out.println("withdrawn successfully");
        System.out.println("Balance " + acc.getBalance());
    }

    public synchronized void deposit(double amount){
        if(!hasValue){
            try{
                System.out.println("Balance: " + acc.getBalance());
                wait();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        hasValue= false;
        acc.deposit(amount);
        System.out.println("Deposited Successfully" + acc.getBalance());

        notify();
    }

}

