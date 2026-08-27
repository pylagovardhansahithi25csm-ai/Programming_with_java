class Employee {
    int id;
    String name;
    double salary;

    // Default constructor
    Employee() {
        id = 0;
        name = "Unknown";
        salary = 0.0;
    }

    // Constructor with two parameters
    Employee(int i, String n) {
        id = i;
        name = n;
        salary = 10000.0;
    }

    // Constructor with three parameters
    Employee(int i, String n, double s) {
        id = i;
        name = n;
        salary = s;
    }

    void display() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
        System.out.println();
    }
}

public class EmployeeData{
    public static void main(String[] args) {

        Employee e1 = new Employee();
        Employee e2 = new Employee(101, "sahithi");
        Employee e3 = new Employee(102, "akshaya", 25000.0);

        e1.display();
        e2.display();
        e3.display();
    }
}
    

