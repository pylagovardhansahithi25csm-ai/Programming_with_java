package Records;
    import java.util.Scanner;

// User-defined exception
class LengthNotSufficientException extends Exception {
    LengthNotSufficientException(String message) {
        super(message);
    }
}

public class ExpectionHandling {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter mobile number: ");
        String mobile = sc.nextLine();

        try {
            // Check whether all characters are digits
            for (int i = 0; i < mobile.length(); i++) {
                if (!Character.isDigit(mobile.charAt(i))) {
                    throw new NumberFormatException();
                }
            }

            // If length is greater than 10
            if (mobile.length() > 10) {
                int[] arr = new int[10];
                System.out.println(arr[mobile.length()]);
            }

            // If length is less than 10
            if (mobile.length() < 10) {
                throw new LengthNotSufficientException(
                    "Invalid Mobile Number - LengthNotSufficientException"
                );
            }

            // Valid number
            System.out.println("Valid number");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(
                "Invalid Mobile Number - ArrayIndexOutOfBounds Exception"
            );

        } catch (LengthNotSufficientException e) {
            System.out.println(e.getMessage());

        } catch (NumberFormatException e) {
            System.out.println(
                "Invalid Mobile Number - NumberFormatException"
            );

        } finally {
            sc.close();
        }
    }
}
