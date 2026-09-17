package Records;
import java.util.Scanner;

// Interface
interface EmployeeSalary {
    void calculateSalary();
}

// Regular Employee
class RegularEmployee implements EmployeeSalary {

    private String employeeId;
    private double basicPay = 25000;
    private double hra = 15000;
    private double ta = 5000;

    RegularEmployee(String employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public void calculateSalary() {

        double total = basicPay + hra + ta;

        System.out.println("\nSalary Details:");
        System.out.println("Employee Id: " + employeeId);
        System.out.println("Basic Pay: " + basicPay);
        System.out.println("HRA: " + hra);
        System.out.println("T.A: " + ta);
        System.out.println("Total Amount: " + total);
    }
}

// Contract Employee
class ContractEmployee implements EmployeeSalary {

    private String employeeId;
    private double basicPay = 12000;
    private double hra = 0;
    private double ta = 3000;

    ContractEmployee(String employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public void calculateSalary() {

        double total = basicPay + hra + ta;

        System.out.println("\nSalary Details:");
        System.out.println("Employee Id: " + employeeId);
        System.out.println("Basic Pay: " + basicPay);
        System.out.println("HRA: " + hra);
        System.out.println("T.A: " + ta);
        System.out.println("Total Amount: " + total);
    }
}

// Main class
public class Interface{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Id: ");
        String id = sc.nextLine();

        // Interface reference
        EmployeeSalary employee;

        if (id.startsWith("R")) {
            employee = new RegularEmployee(id);
        } else {
            employee = new ContractEmployee(id);
        }

        employee.calculateSalary();

        sc.close();
    }
}