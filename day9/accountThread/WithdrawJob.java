package day9.accountThread;

import static java.lang.Thread.currentThread;

public class WithdrawJob implements Runnable{
    Account acc = new Account(10000);
    public synchronized void withdraw(int amount){
        if(acc.getBalance() >= amount){
            System.out.println(currentThread().getName()+ " is ready to withdraw.");
            System.out.println(currentThread().getName()+ " is sleeping");
            try{
                Thread.sleep(2000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(currentThread().getName()+" Wakes UPPPP!!!!");
            acc.withdraw(amount);
            System.out.println(currentThread().getName()+" Withdrawn Successfully!!!!");
            System.out.println("Balance: " + acc.getBalance());
        }
        else{
            System.out.println(currentThread().getName()+" Balance Nahi Hai");
        }
    }
    @Override
    public void run(){
        for (int i = 0;i<3;i++)
        {
            withdraw(2000);

        }
    }
}
