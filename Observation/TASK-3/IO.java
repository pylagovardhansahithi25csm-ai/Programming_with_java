package Observations;
 import java.io.*;
public class IO{
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("data.txt");
            System.out.println("File opened");
        } catch (IOException io) {
            System.out.println("File not found or cannot be read");
        }
    }
}
