package day5.ExceptionHandling;

public class InsufficientFundException extends Exception{
    public InsufficientFundException(String message) {
        super(message);
    }
}
