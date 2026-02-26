package Palindrome;

import java.util.Scanner;

public class UseCasePalindromeCheckerApp {

    // ==============================
    // UC9: Recursive palindrome method
    // ==============================
    public static boolean isPalindromeRecursive(String str, int start, int end) {

        // Base condition
        if (start >= end)
            return true;

        // If characters don't match
        if (str.charAt(start) != str.charAt(end))
            return false;

        // Recursive call
        return isPalindromeRecursive(str, start + 1, end - 1);
    }


    public static void main(String[] args) {

        // ==============================
        // UC1 - Welcome Message
        // ==============================
        System.out.println("====================================");
        System.out.println("      PALINDROME CHECKER APP        ");
        System.out.println("====================================");

        // ==============================
        // UC9 - Recursive Palindrome Checker
        // ==============================

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Remove spaces and convert to lowercase
        input = input.replaceAll("\\s+", "").toLowerCase();

        boolean result = isPalindromeRecursive(input, 0, input.length() - 1);

        if (result)
            System.out.println("Result: The string is a Palindrome.");
        else
            System.out.println("Result: The string is NOT a Palindrome.");

        scanner.close();
    }
}