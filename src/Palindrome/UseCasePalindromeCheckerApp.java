package Palindrome;

import java.util.Scanner;

public class UseCasePalindromeCheckerApp {

    // ==============================
    // UC10: Case-Insensitive & Space-Ignored Palindrome
    // ==============================
    public static boolean isPalindrome(String input) {

        // Normalize string
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


    public static void main(String[] args) {

        // ==============================
        // UC1: Welcome Message
        // ==============================
        System.out.println("====================================");
        System.out.println("      PALINDROME CHECKER APP        ");
        System.out.println("====================================");


        // ==============================
        // UC10 Logic
        // ==============================
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        boolean result = isPalindrome(input);

        if (result)
            System.out.println("Result: The string is a Palindrome.");
        else
            System.out.println("Result: The string is NOT a Palindrome.");

        scanner.close();
    }
}