package Palindrome;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class UseCasePalindromeCheckerApp {

    public static void main(String[] args) {

        // ==============================
        // UC1 - Application Entry & Welcome Message
        // ==============================

        System.out.println("====================================");
        System.out.println("      PALINDROME CHECKER APP        ");
        System.out.println("====================================");
        System.out.println("Application Version: 1.0.0");
        System.out.println("Developed for learning purposes.");
        System.out.println("====================================");


        // ==============================
        // UC7 - Deque-Based Optimized Palindrome Checker
        // ==============================

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        input = input.replaceAll("\\s+", "").toLowerCase();

        Deque<Character> deque = new ArrayDeque<>();

        // Insert characters into deque
        for (int i = 0; i < input.length(); i++) {
            deque.addLast(input.charAt(i));
        }

        boolean isPalindrome = true;

        // Compare front and rear
        while (deque.size() > 1) {

            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        if (isPalindrome) {
            System.out.println("Result: The string is a Palindrome.");
        } else {
            System.out.println("Result: The string is NOT a Palindrome.");
        }
        System.out.println("Completed");
        scanner.close();
    }
}