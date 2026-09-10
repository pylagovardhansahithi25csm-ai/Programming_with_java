package Observations;

 public class NumberFormat {
    public static void main(String[] args) {
        try {
            int number = Integer.parseInt("100c");
            System.out.println(number);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format");
        }
    }
}
