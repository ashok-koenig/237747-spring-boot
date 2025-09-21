package exception_demo;

import java.util.Scanner;

public class BankTransaction {
    private static double balance = 1000.0;
    public static void withdraw(double amount) throws InsufficientFundException{
        if(amount > balance){
            throw new InsufficientFundException("Insufficient balance for withdrawal");
        }
        balance -=amount;
        System.out.println("Withdrawal successful. Remaining balance: "+ balance);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Enter amount to withdraw: ");
            double amount = Double.parseDouble(scanner.nextLine());
            withdraw(amount);
        }catch (NumberFormatException e){
            System.out.println("Please enter a valid number");
        } catch (InsufficientFundException e) {
            System.out.println("Invalid amount: "+ e.getMessage());
        } finally {
            System.out.println("Transaction completed");
        }
    }

//    public static void withdraw(double amount){
//        if(amount > balance){
//            try {
//                throw new InsufficientFundException("Insufficient balance for withdrawal");
//            } catch (InsufficientFundException e) {
//                System.out.println("Error: "+ e.getMessage());
//            }
//        }
//        balance -=amount;
//        System.out.println("Withdrawal successful. Remaining balance: "+ balance);
//    }
}
