public class BankingDemo {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(101, "John Smith", 1000);
        account1.showBalance();
        account1.deposit(500);
        account1.showBalance();
        account1.withdraw(1000);
//        account1.accountBalance = -10000000;
        account1.showBalance();
    }
}
