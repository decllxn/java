package Cornerstones_of_OOP.Encapsulation;

// Encapsulated class
public class Account {
    
    // Private variables to protect data
    private String accountNumber;
    private double balance;

    // Constructor to initialize account and its attributes
    public Account(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        if (initialBalance > 0) {
            this.balance = initialBalance;
        }
    }

    // Public getter for account number
    public String getAccountNumber() {
        return accountNumber;
    }

    // Public getter for balance (no direct access to balance variable)
    public double getBalance() {
        return balance;
    }

    // Public method to deposit money(with validation)
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }
        else {
            System.out.println("Invalid deposit amount");
        }
    }

    // Public method to withdraw money (With validation)
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
        else {
            System.out.println("Invalid withdrawal amount");
        }
    }
}
