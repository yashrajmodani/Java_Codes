package day5.ExceptionHandling;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) throws IncorrectDenominationException, TransactionLimitExceededException, InsufficientFundException {

        System.out.println("Welcome to Aladeen Bank!!!!");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Enter amount to be deposited: ");
        double amount = sc.nextDouble();
        Account acc = new Account(name, amount);
        try{
            System.out.println(acc);
            acc.deposit(500);
            System.out.println(acc);
            acc.withdraw(80000);
            System.out.println(acc);
        }catch(IncorrectDenominationException| TransactionLimitExceededException| InsufficientFundException e){
            System.out.println(e.getMessage());

        }


    }
}
