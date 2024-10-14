package day5.ExceptionHandling;

public class TransactionLimitExceededException extends Exception {
    public TransactionLimitExceededException(String message) {
        super(message);
    }
}
