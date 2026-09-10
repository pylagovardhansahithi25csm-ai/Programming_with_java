package Observations;
 public class Interrupted{
    public static void main(String[] args) {
        try {
            Thread.sleep(1000);
            System.out.println("Thread completed");
        } catch (InterruptedException i) {
            System.out.println("Thread was interrupted");
        }
    }
}
