package Observations;
import java.util.Scanner;

class Student {
    int rollNumber;
    String studentName;
    int[] marks = new int[5];

    // Constructor
    Student(int rollNumber, String studentName, int[] marks) {
        this.rollNumber = rollNumber;
        this.studentName = studentName.trim();
        this.marks = marks;
    }

    // Calculate total marks
    int calculateTotal() {
        int total = 0;

        for (int i = 0; i < marks.length; i++) {
            total += marks[i];
        }

        return total;
    }

    // Calculate average marks
    double calculateAverage() {
        return calculateTotal() / 5.0;
    }

    // Find highest marks
    int findHighest() {
        int highest = marks[0];

        for (int i = 1; i < marks.length; i++) {
            highest = Math.max(highest, marks[i]);
        }

        return highest;
    }

    // Find lowest marks
    int findLowest() {
        int lowest = marks[0];

        for (int i = 1; i < marks.length; i++) {
            lowest = Math.min(lowest, marks[i]);
        }

        return lowest;
    }

    // Calculate percentage
    double calculatePercentage() {
        return (calculateTotal() / 500.0) * 100;
    }

    // Determine grade
    String determineGrade() {
        double percentage = calculatePercentage();

        if (percentage >= 90)
            return "A+";
        else if (percentage >= 80)
            return "A";
        else if (percentage >= 70)
            return "B";
        else if (percentage >= 60)
            return "C";
        else if (percentage >= 50)
            return "D";
        else
            return "F";
    }

    // Performance remark
    String performanceRemark() {
        String grade = determineGrade();

        switch (grade) {
            case "A+":
                return "Excellent Performance";
            case "A":
                return "Very Good Performance";
            case "B":
                return "Good Performance";
            case "C":
                return "Satisfactory Performance";
            case "D":
                return "Needs Improvement";
            default:
                return "Fail - Work Hard";
        }
    }

    // Display student details
    void displayDetails() {
        double percentage = calculatePercentage();

        // Math.round() to two decimal places
        double roundedPercentage = Math.round(percentage * 100.0) / 100.0;

        System.out.println("\n========== STUDENT PERFORMANCE REPORT ==========");
        System.out.println("Roll Number      : " + rollNumber);
        System.out.println("Student Name     : " + studentName.toUpperCase());
        System.out.println("Name Length      : " + studentName.length());

        System.out.println("\nSubject Marks:");

        for (int i = 0; i < marks.length; i++) {
            System.out.println("Subject " + (i + 1) + "        : " + marks[i]);
        }

        System.out.println("\nTotal Marks      : " + calculateTotal() + " / 500");
        System.out.println("Average Marks    : " + calculateAverage());
        System.out.println("Highest Marks    : " + findHighest());
        System.out.println("Lowest Marks     : " + findLowest());
        System.out.println("Percentage       : " + roundedPercentage + "%");
        System.out.println("Grade            : " + determineGrade());

        if (percentage >= 50)
            System.out.println("Result           : PASS");
        else
            System.out.println("Result           : FAIL");

        System.out.println("Remark           : " + performanceRemark());

    }
}

public class StudentPerformance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll Number: ");
        int rollNumber = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student Name: ");
        String studentName = sc.nextLine();

        int[] marks = new int[5];

        System.out.println("Enter marks for 5 subjects:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        // Create Student object
        Student student = new Student(rollNumber, studentName, marks);

        // Display complete performance report
        student.displayDetails();

        sc.close();
    }
}