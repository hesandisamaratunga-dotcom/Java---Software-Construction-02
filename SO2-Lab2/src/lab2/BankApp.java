package lab2;

import java.util.Scanner;

public class BankApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create the account with the user's name and a starting balance
        System.out.print("Account holder name: ");
        String name = scanner.nextLine();
        System.out.print("Initial balance: ");
        double initialBalance = scanner.nextDouble();

        BankAccount account = new BankAccount(name, initialBalance);
        System.out.println("Account created.");

        int choice = -1; // any value except 0 starts the loop
        while (choice != 0) {
            System.out.println();
            System.out.println("1: Check balance");
            System.out.println("2: Make deposit");
            System.out.println("3: Make withdrawal");
            System.out.println("4: Display account info");
            System.out.println("0: Exit");
            System.out.print("Choice: ");
            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.printf("Current balance: %.2f EUR%n", account.getBalance());

            } else if (choice == 2) {
                System.out.print("Amount to deposit: ");
                double amount = scanner.nextDouble();
                // deposit() returns true or false, the menu prints the message
                if (account.deposit(amount)) {
                    System.out.println("Deposit successful.");
                } else {
                    System.out.println("Error: The amount must be positive.");
                }

            } else if (choice == 3) {
                System.out.print("Amount to withdraw: ");
                double amount = scanner.nextDouble();
                if (account.withdraw(amount)) {
                    System.out.println("Withdrawal successful.");
                } else {
                    System.out.println("Error: The amount must be positive and not higher than the balance.");
                }

            } else if (choice == 4) {
                account.displayInfo();

            } else if (choice != 0) {
                System.out.println("Invalid choice.");
            }
        }

        System.out.println("Goodbye!");
        scanner.close();
    }
}