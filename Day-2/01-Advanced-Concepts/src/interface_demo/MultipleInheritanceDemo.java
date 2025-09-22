package interface_demo;

interface Validator {
    boolean validateAmount(double amount);
}

interface PaymentGateway {
    void makePayment(double amount);
}

class CreditCardPayment implements Validator, PaymentGateway {
    String cardNumber;
    CreditCardPayment(String cardNumber){
        this.cardNumber = cardNumber;
    }

    @Override
    public void makePayment(double amount) {
        if(validateAmount(amount)){
            System.out.println("Payment successful for card: "+ cardNumber+ " with amount: "+ amount);
        }else {
            System.out.println("Invalid payment amount: "+ amount);
        }
    }

    @Override
    public boolean validateAmount(double amount) {
        return amount>0;
    }
}

public class MultipleInheritanceDemo {
    public static void main(String[] args) {
        CreditCardPayment payment = new CreditCardPayment("1111-2222-3333-4444");
        payment.makePayment(2300);
        payment.makePayment(-7676);
    }
}
