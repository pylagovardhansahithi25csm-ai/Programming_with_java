class Student {
    String name;
    int rollNo;
    int marks;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
    }

    void checkResult() {
        if (marks >= 40)
            System.out.println("Result: Pass");
        else
            System.out.println("Result: Fail");
    }
}

public class ImplementationClass {
    public static void main(String[] args) {

        Student s = new Student();

        s.name = "sahithi";
        s.rollNo = 101;
        s.marks =90;

        s.display();
        s.checkResult();
    }
} 