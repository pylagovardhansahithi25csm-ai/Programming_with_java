
interface PaymentService {
    void pay(String upiId, double amount)
            throws InvalidUPIException, InvalidAmountException, InsufficientBalanceException;

    void checkBalance();
}

// Custom Exception 1
class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String message) {
        super(message);
    }
}

// Custom Exception 2
class InvalidUPIException extends Exception {
    InvalidUPIException(String message) {
        super(message);
    }
}

// Custom Exception 3
class InvalidAmountException extends Exception {
    InvalidAmountException(String message) {
        super(message);
    }
}

// Wallet Class
class Wallet {

    // Private data members - Encapsulation
    private String userName;
    private String mobileNumber;
    private String upiId;
    private double balance;

    // Constructor
   public Wallet (String userName,String mobileNumber,String upiId,double balance){
        this.userName = userName;
        this.mobileNumber = mobileNumber;
        this.upiId = upiId;
        this.balance = balance;
    }

    // Add money
    void addMoney(double amount) throws InvalidAmountException {

        if (amount <= 0) {
            throw new InvalidAmountException(
                    "Invalid amount! Amount must be greater than zero."
            );
        }

        balance = balance + amount;
        System.out.println("Money added successfully: Rs." + amount);
    }

    // Get balance
    double getBalance() {
        return balance;
    }

    // Display wallet details
    void displayWalletDetails() {
        System.out.println("\n----- Wallet Details -----");
        System.out.println("User Name    : " + userName);
        System.out.println("Mobile Number: " + mobileNumber);
        System.out.println("UPI ID       : " + upiId);
        System.out.println("Balance      : Rs." + balance);
    }
}

// UPI Payment Class
class UPIPayment implements PaymentService {

    private Wallet wallet;

    // Constructor
  public UPIPayment(Wallet wallet) {
        this.wallet = wallet;
    }

    // Pay method
    @Override
    public void pay(String upiId, double amount)
            throws InvalidUPIException,
                   InvalidAmountException,
                   InsufficientBalanceException {

        // Validate UPI ID using String operations
        if (upiId == null || !upiId.contains("@")) {
            throw new InvalidUPIException(
                    "Invalid UPI ID! UPI ID must contain '@'."
            );
        }

        // Validate amount
        if (amount <= 0) {
            throw new InvalidAmountException(
                    "Invalid payment amount! Amount must be greater than zero."
            );
        }

        // Check balance
        if (amount > wallet.getBalance()) {
            throw new InsufficientBalanceException(
                    "Insufficient balance! Payment cannot be processed."
            );
        }

        // Deduct amount
        double remainingBalance = wallet.getBalance() - amount;

        // Add the remaining balance back using reflection is unnecessary;
        
        System.out.println("\nPayment Successful!");
        System.out.println("Paid to       : " + upiId);
        System.out.println("Amount        : Rs." + amount);
        System.out.println("Remaining     : Rs." + wallet.getBalance());
    }

    // Check balance
    @Override
    public void checkBalance() {
        System.out.println("Available Balance: Rs." + wallet.getBalance());
    }
}
public class UPIWalletSystem {

    public static void main(String[] args) {
    

        // Create wallet
        Wallet wallet = new Wallet(
                "Sahithi",
                "9876543210",
                "sahithi@upi",
                5000
        );

        // Create payment service object
        PaymentService payment = new UPIPayment(wallet);

        // Add money
        try {
            wallet.addMoney(2000);
        } catch (InvalidAmountException e) {
            System.out.println(e.getMessage());
        }

        // Check balance
        payment.checkBalance();

        // Transaction
        try {

            String receiverUPI = "friend@upi";
            double amount = 1500;

            payment.pay(receiverUPI, amount);

        } catch (InvalidUPIException e) {
            System.out.println("Transaction Failed: " + e.getMessage());

        } catch (InvalidAmountException e) {
            System.out.println("Transaction Failed: " + e.getMessage());

        } catch (InsufficientBalanceException e) {
            System.out.println("Transaction Failed: " + e.getMessage());

        } finally {
            System.out.println("\nTransaction process completed.");
        }

        wallet.displayWalletDetails();
    }
}
