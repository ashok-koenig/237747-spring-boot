public class BankAccount {
    private int accountNumber;
    private String accountName;
    private double accountBalance;
    BankAccount(int accountNumber, String accountName, double accountBalance){
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.accountBalance = accountBalance;
    }

    public void deposit(double amount){
        if(amount>0){
            accountBalance += amount;
            System.out.println(amount + " deposit successful");
        }else{
            System.out.println("Invalid amount to deposit");
        }
    }

    public void withdraw(double amount){
        if(amount <= accountBalance){
            accountBalance -= amount;
            System.out.println(amount + " withdrawal successful");
        }else{
            System.out.println("Insufficient balance");
        }
    }

    public void showBalance(){
        System.out.println(accountName + " with account number "+ accountNumber + " balance is "+ accountBalance);
    }
}
