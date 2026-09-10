package Observations;

public class Illegalarguments {

    public static void main(String[] args) {
        try {
            Thread.sleep(-100);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid argument");
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }
}
