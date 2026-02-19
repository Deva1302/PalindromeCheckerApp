package Palindrome;

import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class UseCasePalindromeCheckerApp {

    public static void main(String[] args) {

        // ==============================
        // UC6 - Queue + Stack Based Palindrome Check
        // ==============================

        System.out.println("====================================");
        System.out.println("      PALINDROME CHECKER APP        ");
        System.out.println("====================================");

        // Original string
        String original = "madam";

        // Create Stack and Queue
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        // Push and Enqueue characters
        for (int i = 0; i < original.length(); i++) {
            char ch = original.charAt(i);
            stack.push(ch);      // LIFO
            queue.add(ch);       // FIFO
        }

        // Compare characters
        boolean isPalindrome = true;

        while (!stack.isEmpty()) {
            char stackChar = stack.pop();    // Last in
            char queueChar = queue.remove(); // First in

            if (stackChar != queueChar) {
                isPalindrome = false;
                break;
            }
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
