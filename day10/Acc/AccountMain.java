package day10.Acc;


public class AccountMain {
    public static void main(String[] args) {
        AccountFunctioning af = new AccountFunctioning();
        Thread withdraw = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<5; i++){
                    af.withdraw(2000);
                    try{
                        Thread.sleep(2000);
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        });
        Thread deposit = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<5; i++){
                    af.deposit(1000);
                    try{
                        Thread.sleep(2000);
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        });
        withdraw.start();
        deposit.start();
    }
}

