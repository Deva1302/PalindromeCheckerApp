package Palindrome;

public class UseCasePalindromeCheckerApp {

    public static void main(String[] args) {

        // ==============================
        // UC4 - Character Array Based Palindrome Check
        // ==============================

        System.out.println("====================================");
        System.out.println("      PALINDROME CHECKER APP        ");
        System.out.println("====================================");

        // Original string
        String original = "madam";

        // Convert string to character array
        char[] charArray = original.toCharArray();

        // Two-pointer technique
        int start = 0;
        int end = charArray.length - 1;

        boolean isPalindrome = true;

        while (start < end) {
            if (charArray[start] != charArray[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Display result
        if (isPalindrome) {
            System.out.println("The string \"" + original + "\" is a PALINDROME.");
        } else {
            System.out.println("The string \"" + original + "\" is NOT a palindrome.");
        }

        System.out.println("====================================");

    }
}
