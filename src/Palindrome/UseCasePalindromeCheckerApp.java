package Palindrome;

import java.util.Scanner;

// ==============================
// UC11: Palindrome Service Class (Encapsulation)
// ==============================
class PalindromeChecker {

    // Method to check palindrome
    public boolean checkPalindrome(String input) {

        // Normalize string (ignore spaces and case)
        input = input.replaceAll("\\s+", "").toLowerCase();

        int start = 0;
        int end = input.length() - 1;

        while (start < end) {

            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}


// ==============================
// Main Application Class
// ==============================
public class UseCasePalindromeCheckerApp {

    public static void main(String[] args) {

        // UC1 Welcome Message
        System.out.println("====================================");
        System.out.println("      PALINDROME CHECKER APP        ");
        System.out.println("====================================");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Create object of PalindromeChecker
        PalindromeChecker checker = new PalindromeChecker();

        // Call service method
        boolean result = checker.checkPalindrome(input);

        if (result)
            System.out.println("Result: The string is a Palindrome.");
        else
            System.out.println("Result: The string is NOT a Palindrome.");

        scanner.close();
    }
}