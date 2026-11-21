package lab2;

public class BankAccount {

    // Private fields: can only be changed through the methods below
    private String accountHolder;
    private double balance;

    // Constructor: sets the holder and the starting balance
    public BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0; // a negative start balance is not allowed
        }
    }

    // Adds money. Returns false if the amount is not positive.
    public boolean deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        }
        return false;
    }

    // Takes money out. Returns false if the amount is not positive or too high.
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    // Prints all account information
    public void displayInfo() {
        System.out.println("Account holder: " + accountHolder);
        System.out.printf("Balance: %.2f EUR%n", balance);
    }
}