package Palindrome;

import java.util.Scanner;

public class UseCasePalindromeCheckerApp {

    // ==============================
    // Node class for Linked List
    // ==============================
    static class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    // ==============================
    // Method to check palindrome using Linked List
    // ==============================
    public static boolean isPalindrome(String input) {

        // Step 1: Convert string to linked list
        Node head = null, tail = null;

        for (char c : input.toCharArray()) {
            Node newNode = new Node(c);

            if (head == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        // Step 2: Find middle using fast and slow pointer
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 3: Reverse second half
        Node prev = null;
        Node current = slow;

        while (current != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        // Step 4: Compare both halves
        Node firstHalf = head;
        Node secondHalf = prev;

        while (secondHalf != null) {
            if (firstHalf.data != secondHalf.data) {
                return false;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        return true;
    }

    // ==============================
    // Main Method
    // ==============================
    public static void main(String[] args) {

        // UC1 Welcome Message
        System.out.println("====================================");
        System.out.println("      PALINDROME CHECKER APP        ");
        System.out.println("====================================");

        // UC8 Logic
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        input = input.replaceAll("\\s+", "").toLowerCase();

        boolean result = isPalindrome(input);

        if (result)
            System.out.println("Result: The string is a Palindrome.");
        else
            System.out.println("Result: The string is NOT a Palindrome.");

        scanner.close();
    }
}