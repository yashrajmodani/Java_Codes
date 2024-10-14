package day5.ExceptionHandling;

public class IncorrectDenominationException extends Exception{
    public IncorrectDenominationException(String message){
        super(message);
    }
}
