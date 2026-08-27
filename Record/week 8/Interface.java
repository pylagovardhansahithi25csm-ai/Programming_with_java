interface Employee {
    void salaryDetails();
}

class Manager implements Employee {
    public void salaryDetails() {
        

        System.out.println("Employee Name:sahithi ");
        System.out.println("Employee ID: 101");
        System.out.println("Salary: Rs. 50000");
    }
}

public class Interface {
    public static void main(String[] args) {

        Employee e = new Manager();

        e.salaryDetails();
    }
} 
    