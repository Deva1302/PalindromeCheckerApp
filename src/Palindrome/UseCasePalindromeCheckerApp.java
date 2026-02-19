package Palindrome;

public class UseCasePalindromeCheckerApp {

    public static void main(String[] args) {

        // ==============================
        // UC3 - Palindrome Check Using String Reverse
        // ==============================

        System.out.println("====================================");
        System.out.println("      PALINDROME CHECKER APP        ");
        System.out.println("====================================");

        // Original string
        String original = "madam";

        // Reverse string using for loop
        String reversed = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        // Compare original and reversed string
        if (original.equals(reversed)) {
            System.out.println("The string \"" + original + "\" is a PALINDROME.");
        } else {
            System.out.println("The string \"" + original + "\" is NOT a palindrome.");
        }

        System.out.println("====================================");

    }
}
