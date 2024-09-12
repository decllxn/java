package Cornerstones_of_OOP.Encapsulation;


public class BankingApplication {
    public static void main(String[] args) {
        Account account = new Account("123456", 550.00);

        // Display account details
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Account Balance: $" + account.getBalance());

        // Attempt to deposit a valid amount
        account.deposit(100.00);
        System.out.println("Current: $" + account.getBalance());

        // Attempt to withdraw
        account.withdraw(200.00);
        System.out.println("Current Balance: $" + account.getBalance());

    }
}