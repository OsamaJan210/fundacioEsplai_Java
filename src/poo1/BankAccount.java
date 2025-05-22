package poo1;

import java.util.Scanner;

public class BankAccount {
    private String holder;
    private double balance;

    public BankAccount(String holder, double initialBalance) {
        this.holder = holder;
        if (initialBalance < 0) {
            System.out.println("Initial balance can't be negative. Setting to 0.");
            this.balance = 0;
        } else {
            this.balance = initialBalance;
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient funds. Withdrawal canceled.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        }
    }

    public double getBalance() {
        return balance;
    }

    public void displaySummary() {
        System.out.println("\n--- Account Summary ---");
        System.out.println("Account Holder: " + holder);
        System.out.println("Final Balance: $" + balance);
    }

    public static void bankSimulation(){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter account holder name: ");
        String holder = scanner.nextLine();

        System.out.print("Enter initial balance: ");
        double initialBalance = scanner.nextDouble();

        BankAccount account = new BankAccount(holder, initialBalance);

        int choice;
        do {
            System.out.println("\n--- Bank Menu ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit and Show Summary");
            System.out.print("Choose an option (1-4): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmt = scanner.nextDouble();
                    account.deposit(depositAmt);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmt = scanner.nextDouble();
                    account.withdraw(withdrawAmt);
                    break;
                case 3:
                    System.out.println("Current Balance: $" + account.getBalance());
                    break;
                case 4:
                    account.displaySummary();
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}


