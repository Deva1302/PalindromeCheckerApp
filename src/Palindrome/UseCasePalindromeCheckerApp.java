package Palindrome;

import java.util.*;

// ==============================
// Strategy Interface
// ==============================
interface PalindromeStrategy {
    boolean check(String input);
}


// ==============================
// Stack Strategy Implementation
// ==============================
class StackStrategy implements PalindromeStrategy {

    public boolean check(String input) {

        input = input.replaceAll("\\s+", "").toLowerCase();

        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}


// ==============================
// Deque Strategy Implementation
// ==============================
class DequeStrategy implements PalindromeStrategy {

    public boolean check(String input) {

        input = input.replaceAll("\\s+", "").toLowerCase();

        Deque<Character> deque = new ArrayDeque<>();

        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {

            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }

        return true;
    }
}


// ==============================
// Context Class
// ==============================
class PalindromeChecker {

    private PalindromeStrategy strategy;

    public PalindromeChecker(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean checkPalindrome(String input) {
        return strategy.check(input);
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

        System.out.println("\nChoose Strategy:");
        System.out.println("1. Stack Strategy");
        System.out.println("2. Deque Strategy");

        System.out.print("Enter choice: ");
        int choice = scanner.nextInt();

        PalindromeStrategy strategy;

        if (choice == 1)
            strategy = new StackStrategy();
        else
            strategy = new DequeStrategy();

        PalindromeChecker checker = new PalindromeChecker(strategy);

        boolean result = checker.checkPalindrome(input);

        if (result)
            System.out.println("Result: The string is a Palindrome.");
        else
            System.out.println("Result: The string is NOT a Palindrome.");

        scanner.close();
    }
}