package Observations;

public class ClassNotFound{
    public static void main(String[] args) {
        try {
            Class.forName("abc.Test");
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found");
        }
    }
}