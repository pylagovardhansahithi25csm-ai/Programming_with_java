package Observations;
    import java.io.*;

public class FileNotFound {
    public static void main(String[] args) {
        try{
            FileInputStream file = new FileInputStream("abc.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist");
        }
    }
}

    

