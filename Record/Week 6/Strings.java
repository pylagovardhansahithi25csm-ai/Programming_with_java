package Records;

import java.util.Scanner;

public class Strings {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int start = 0;
        int maxLength = 0;
        String longest = "";

        for (int end = 0; end < str.length(); end++) {

            char current = str.charAt(end);

            // Check for repeated character
            int index = str.indexOf(current, start);

            if (index != end) {
                start = index + 1;
            }

            int currentLength = end - start + 1;

            if (currentLength > maxLength) {
                maxLength = currentLength;
                longest = str.substring(start, end + 1);
            }
        }

        System.out.println("Longest substring: " + longest);
        System.out.println("Length: " + maxLength);

        sc.close();
    }
} 