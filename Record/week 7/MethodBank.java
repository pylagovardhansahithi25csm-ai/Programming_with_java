class Bank {
    void rateOfInterest() {
        System.out.println("Bank rate of interest: 5%");
    }
}

class SBI extends Bank {
    @Override
    void rateOfInterest() {
        System.out.println("SBI rate of interest: 7%");
    }
}

class HDFC extends Bank {
    @Override
    void rateOfInterest() {
        System.out.println("HDFC rate of interest: 8%");
    }
}

class ICICI extends Bank {
    @Override
    void rateOfInterest() {
        System.out.println("ICICI rate of interest: 9%");
    }
}

public class MethodBank {
    public static void main(String[] args) {

        SBI s=new SBI();
        s.rateOfInterest();

        HDFC h =new HDFC();
        h.rateOfInterest();

        ICICI i=new ICICI();
        i.rateOfInterest();
    }
}