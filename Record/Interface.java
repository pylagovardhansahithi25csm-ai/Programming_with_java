package project;

import java.util.Scanner;

interface Employee {
    void getSalaryDetails();
class RegularEmployee implements Employee {

    public void getSalaryDetails() {
        int basicPay = 25000;
        int hra = 15000;
        int ta = 5000;

        int total = basicPay + hra + ta;

        System.out.println("Salary Details:");
        System.out.println("Basic Pay: " + basicPay);
        System.out.println("HRA: " + hra);
        System.out.println("T.A: " + ta);
        System.out.println("Total Amount: " + total);
    }
}


class ContractEmployee implements Employee {

    public void getSalaryDetails() {
        int basicPay = 12000;
        int hra = 0;
        int ta = 3000;

        int total = basicPay + hra + ta;

        System.out.println("Salary Details:");
        System.out.println("Basic Pay: " + basicPay);
        System.out.println("HRA: " + hra);
        System.out.println("T.A: " + ta);
        System.out.println("Total Amount: " + total);
    }
}

public class Interface {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Id: ");
        String empId = sc.nextLine();

        
        Employee emp;

        
        if (empId.startsWith("R")) {
            emp = new RegularEmployee();
        } else {
            emp = new ContractEmployee();
        }

        emp.getSalaryDetails();

        sc.close();
    }
}

