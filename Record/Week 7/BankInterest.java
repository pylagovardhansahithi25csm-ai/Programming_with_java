package Records;

    import java.util.Scanner;

// Customer class
class Customer {
    String name;
    int customerId;

    Customer(String name, int customerId) {
        this.name = name;
        this.customerId = customerId;
    }
}

// Account class
class Account {
    int accountNumber;
    double balance;

    Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
}

// RBI Base Class
class RBI {

    double getRateOfInterest() {
        return 4.0;
    }
}

// SBI Derived Class
class SBI extends RBI {

    @Override
    double getRateOfInterest() {
        return 7.0;
    }
}

// ICICI Derived Class
class ICICI extends RBI {

    @Override
    double getRateOfInterest() {
        return 6.5;
    }
}

// PNB Derived Class
class PNB extends RBI {

    @Override
    double getRateOfInterest() {
        return 6.0;
    }
}

// Main Class
public class BankInterest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Bank name to find the rate of Interest : ");
        String bankName = sc.nextLine();

        // Dynamic polymorphism
        RBI bank;

        if (bankName.equalsIgnoreCase("RBI")) {
            bank = new RBI();
            System.out.println("RBI rate of interest is : "
                    + bank.getRateOfInterest() + "%");

        } else if (bankName.equalsIgnoreCase("SBI")) {
            bank = new SBI();
            System.out.println("RBI rate of interest is : "
                    + bank.getRateOfInterest() + "%");

        } else if (bankName.equalsIgnoreCase("ICICI")) {
            bank = new ICICI();
            System.out.println("RBI rate of interest is : "
                    + bank.getRateOfInterest() + "%");

        } else if (bankName.equalsIgnoreCase("PNB")) {
            bank = new PNB();
            System.out.println("RBI rate of interest is : "
                    + bank.getRateOfInterest() + "%");

        } else {
            System.out.println("Invalid Bank Name");
        }

        sc.close();
    }
}
