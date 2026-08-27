
    
}
package javacore;
import java.util.Scanner;

// Bank Account Class
class BankAccount {

    private int accountNumber;
    private String accountHolderName;
    private double balance;

    // Constructor
    BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Amount deposited successfully.");
        } else {
            System.out.println("Invalid amount.");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance = balance - amount;
            System.out.println("Amount withdrawn successfully.");
        }
    }

    // Display account details
    public void displayDetails() {
        System.out.println("\n----- Account Details -----");
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolderName);
        System.out.println("Balance        : Rs. " + balance);
    }

    // Getter for account number
    public int getAccountNumber() {
        return accountNumber;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }
}


// Bank Management Class
class Bank {

    // Fixed-size array instead of ArrayList
    private BankAccount[] accounts;
    private int count;

    // Constructor
    Bank(int size) {
        accounts = new BankAccount[size];
        count = 0;
    }

    // Create account
    public void createAccount(int accountNumber, String name, double initialBalance) {

        if (count >= accounts.length) {
            System.out.println("Bank account limit reached.");
            return;
        }

        if (findAccount(accountNumber) != null) {
            System.out.println("Account already exists.");
            return;
        }

        if (initialBalance < 0) {
            System.out.println("Invalid initial balance.");
            return;
        }

        accounts[count] =
            new BankAccount(accountNumber, name, initialBalance);

        count++;

        System.out.println("Account created successfully.");
    }

    // Find account
    public BankAccount findAccount(int accountNumber) {

        for (int i = 0; i < count; i++) {

            if (accounts[i].getAccountNumber() == accountNumber) {
                return accounts[i];
            }
        }

        return null;
    }

    // Deposit money
    public void depositMoney(int accountNumber, double amount) {

        BankAccount account = findAccount(accountNumber);

        if (account != null) {
            account.deposit(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    // Withdraw money
    public void withdrawMoney(int accountNumber, double amount) {

        BankAccount account = findAccount(accountNumber);

        if (account != null) {
            account.withdraw(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    // Check balance
    public void checkBalance(int accountNumber) {

        BankAccount account = findAccount(accountNumber);

        if (account != null) {
            System.out.println("Current Balance: Rs. "
                    + account.getBalance());
        } else {
            System.out.println("Account not found.");
        }
    }

    // Display account details
    public void displayAccount(int accountNumber) {

        BankAccount account = findAccount(accountNumber);

        if (account != null) {
            account.displayDetails();
        } else {
            System.out.println("Account not found.");
        }
    }
}


// Main Class
public class BankManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create Bank object
        // Maximum 100 accounts
        Bank bank = new Bank(100);

        int choice;

        do {
            System.out.println("     BANK MANAGEMENT SYSTEM");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Check Balance");
            System.out.println("5. Display Account Details");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Account Number: ");
                    int accountNumber = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Account Holder Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Initial Balance: ");
                    double balance = sc.nextDouble();

                    bank.createAccount(
                            accountNumber,
                            name,
                            balance
                    );

                    break;


                case 2:

                    System.out.print("Enter Account Number: ");
                    accountNumber = sc.nextInt();

                    System.out.print("Enter Deposit Amount: ");
                    double depositAmount = sc.nextDouble();

                    bank.depositMoney(
                            accountNumber,
                            depositAmount
                    );

                    break;


                case 3:

                    System.out.print("Enter Account Number: ");
                    accountNumber = sc.nextInt();

                    System.out.print("Enter Withdrawal Amount: ");
                    double withdrawAmount = sc.nextDouble();

                    bank.withdrawMoney(
                            accountNumber,
                            withdrawAmount
                    );

                    break;


                case 4:

                    System.out.print("Enter Account Number: ");
                    accountNumber = sc.nextInt();

                    bank.checkBalance(accountNumber);

                    break;


                case 5:

                    System.out.print("Enter Account Number: ");
                    accountNumber = sc.nextInt();

                    bank.displayAccount(accountNumber);

                    break;


                case 6:

                    System.out.println(
                        "Thank you for using the Bank Management System."
                    );

                    break;


                default:

                    System.out.println(
                        "Invalid choice. Please try again."
                    );
            }

        } while (choice != 6);

        sc.close();
    }
}