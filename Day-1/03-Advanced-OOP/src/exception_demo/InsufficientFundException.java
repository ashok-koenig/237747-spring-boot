package exception_demo;

// Custom exception
public class InsufficientFundException extends Exception{
    public InsufficientFundException(String message){
        super(message);
    }
}
