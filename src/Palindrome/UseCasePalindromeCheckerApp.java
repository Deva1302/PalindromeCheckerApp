package Palindrome;

import java.util.Stack;

public class UseCasePalindromeCheckerApp {

    public static void main(String[] args) {

        // ==============================
        // UC5 - Stack-Based Palindrome Checker
        // ==============================

        System.out.println("====================================");
        System.out.println("      PALINDROME CHECKER APP        ");
        System.out.println("====================================");

        // Original string
        String original = "madam";

        // Create a Stack
        Stack<Character> stack = new Stack<>();

        // Push all characters into stack
        for (int i = 0; i < original.length(); i++) {
            stack.push(original.charAt(i));
        }

        // Pop characters and build reversed string
        String reversed = "";

        while (!stack.isEmpty()) {
            reversed = reversed + stack.pop();
        }

        // Compare original and reversed
        if (original.equals(reversed)) {
            System.out.println("The string \"" + original + "\" is a PALINDROME.");
        } else {
            System.out.println("The string \"" + original + "\" is NOT a palindrome.");
        }

        System.out.println("====================================");

    }
}
