class Account {

    // Attributes
     int accountNumber;
    String accountHolderName;
    double balance;
    String accountType;

    // Constructor
    Account(int accountNumber, String accountHolderName,double balance, String accountType) {

        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.accountType = accountType;
    }

    // Deposit method
    void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    // Withdraw method
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdraw: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    // Transfer method
    void transfer(Account receiver, double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            receiver.balance = receiver.balance + amount;

            System.out.println("Transferred: " + amount);
            System.out.println("From Account: " + accountNumber);
            System.out.println("To Account: " + receiver.accountNumber);
        } else {
            System.out.println("Transfer failed - Insufficient balance");
        }
    }

    // Display account details
    void displayAccountDetails() {
        System.out.println("\n--- Account Details ---");
        System.out.println("Account Number   : " + accountNumber);
        System.out.println("Account Holder   : " + accountHolderName);
        System.out.println("Account Type     : " + accountType);
        System.out.println("Balance          : " + balance);
    }
}
// SavingsAccount inherits Account
class SavingsAccount extends Account {

    double interestRate;

    // Constructor
    SavingsAccount(int accountNumber, String accountHolderName,double balance, double interestRate) {

        super(accountNumber, accountHolderName, balance, "Savings");
        this.interestRate = interestRate;
    }

    // Calculate interest
    void calculateInterest() {
        double interest = (balance * interestRate) / 100;
        balance = balance + interest;

        System.out.println("Interest Rate     : " + interestRate + "%");
        System.out.println("Interest Earned   : " + interest);
    }
}


// CurrentAccount inherits Account
class CurrentAccount extends Account {

    double overdraftLimit;

    // Constructor
    CurrentAccount(int accountNumber, String accountHolderName,double balance, double overdraftLimit) {

        super(accountNumber, accountHolderName, balance, "Current");
        this.overdraftLimit = overdraftLimit;
    }

    // Method overriding
    @Override
    void withdraw(double amount) {

        if (amount > 0 && amount <= balance + overdraftLimit) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Withdrawal exceeds overdraft limit");
        }
    }

    // Display current account details
    @Override
    void displayAccountDetails() {
        super.displayAccountDetails();
        System.out.println("Overdraft Limit  : " + overdraftLimit);
    }
}


public class BankMangementSystem {

    public static void main(String[] args) {

        SavingsAccount sa = new SavingsAccount(101, "Sahithi", 10000, 5);

        // Creating CurrentAccount object
        CurrentAccount ca =new CurrentAccount(102, "Ashmitha", 5000, 3000);


        // Display details before transactions
        System.out.println(" BEFORE TRANSACTIONS");

        sa.displayAccountDetails();
        ca.displayAccountDetails();


        // Savings account operations
        System.out.println("\nSAVINGS ACCOUNT OPERATIONS");

        sa.deposit(2000);
        sa.withdraw(1000);
        sa.calculateInterest();


        // Current account operations
        System.out.println("\nCURRENT ACCOUNT OPERATIONS");

        ca.deposit(3000);
        ca.withdraw(9000);


        // Transfer money from Savings to Current
        System.out.println("\nFUND TRANSFER");

        sa.transfer(ca, 2000);


        // Display details after transactions
        System.out.println("\n AFTER TRANSACTIONS");

        sa.displayAccountDetails();
        ca.displayAccountDetails();


        // Final balances
        System.out.println("\n FINAL BALANCES");

        System.out.println("Savings Account Final Balance : "+ sa.balance);

        System.out.println("Current Account Final Balance : "+ ca.balance);
    }
}