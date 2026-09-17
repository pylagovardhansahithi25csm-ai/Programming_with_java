package Records;
public class Employee {

    String name;
    int id;
    String designation;
    double salary;
    String promotionStatus;

    // Constructor 1
     public Employee(String name, int id) {
        this.name = name;
        this.id = id;
        this.designation = "Junior Employee";
        this.salary = 25000;
        this.promotionStatus = "Not Eligible";
    }

    // Constructor 2
        public Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        this.salary = 40000;
        this.promotionStatus = "Under Review";
    }

    // Constructor 3
       public  Employee(String name, int id, String designation, double salary, String promotionStatus) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        this.salary = salary;
        this.promotionStatus = promotionStatus;
    }

    // Method
    void displayDetails() {
        System.out.println("Name             : " + name);
        System.out.println("ID               : " + id);
        System.out.println("Designation      : " + designation);
        System.out.println("Salary           : " + salary);
        System.out.println("Promotion Status : " + promotionStatus);

    }

    public static void main(String[] args) {

        Employee e1 = new Employee("Ravi", 101);

        Employee e2 = new Employee( "Sita", 102, "Senior Developer" );

        Employee e3 = new Employee("Kiran", 103, "Project Manager",75000, "Promoted");

        e1.displayDetails();
        e2.displayDetails();
        e3.displayDetails();
    }
}