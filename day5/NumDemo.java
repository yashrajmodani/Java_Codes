package day5;
import java.util.Scanner;

public class NumDemo {
    public static void checkNum(int num) throws Exception{
        if (num > 60000){
            throw new Exception("Number too big!!!");
        }else{
            System.out.println("Your number is: " + num);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Integer Number: ");
        int num = sc.nextInt();
        try{
            checkNum(num);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
