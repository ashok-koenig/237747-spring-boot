package abstract_demo;

abstract class Payment {
    String accountName;
    Payment(String accountName){
        this.accountName = accountName;
    }
    // Abstract method: to be implemented by specific payment types
    abstract void processPayment(double amount);

    // Concrete method: Common method for all types of payment
    void showConfirmation(double amount){
        System.out.println("Payment of "+ amount + "has been processed for "+ accountName);
    }
}

class CreditCardPayment extends Payment{
    String cardNumber;
    CreditCardPayment(String accountName, String cardNumber){
        super(accountName);
        this.cardNumber = cardNumber;
    }

    @Override
    void processPayment(double amount) {
        System.out.println("Processing credit card payment of "+ amount+ " for card number"+ cardNumber);
    }
}

class PayPalPayment extends Payment{
    String payPalId;
    PayPalPayment(String accountName, String payPalId){
        super(accountName);
        this.payPalId = payPalId;
    }

    @Override
    void processPayment(double amount) {
        System.out.println("Processing paypal payment of "+ amount+ " for payPalID: "+ payPalId);
    }
}

public class OnlinePaymentExample {
    public static void main(String[] args) {
        // Credit card payment
        Payment cardPayment = new CreditCardPayment("John Smith", "1111-2222-3333-4444");
        cardPayment.processPayment(1000);
        cardPayment.showConfirmation(1000);

        // Paypal payment
        Payment payPalPayment = new PayPalPayment("Peter", "paypal-12234");
        payPalPayment.processPayment(500);
        payPalPayment.showConfirmation(500);

    }
}
