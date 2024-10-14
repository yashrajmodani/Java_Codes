package day5;

public class Math {
    public static void main(String[] args) {
        try{
            int dividend = Integer.parseInt(args[0]);
            int divisor = Integer.parseInt(args[0]);

            int res = dividend/ divisor;
            System.out.println(res);
        }
        catch(ArithmeticException e){
            System.out.println("The Divisor Cannot be Zero");
            e.printStackTrace();
        }
        catch(NumberFormatException e){
            System.out.println("Enter Integers Only");
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Enter two values as a dividend and divisor");
            System.out.println(e.getMessage());
        }
    }
}