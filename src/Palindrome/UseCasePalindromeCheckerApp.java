package Palindrome;

import java.util.Stack;

public class UseCasePalindromeCheckerApp {

    // Method 1: String Reverse
    public static boolean checkUsingReverse(String original) {

        String reversed = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        return original.equals(reversed);
    }

    // Method 2: Char Array Two Pointer
    public static boolean checkUsingCharArray(String original) {

        char[] array = original.toCharArray();

        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            if (array[start] != array[end]) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    // Method 3: Stack Method
    public static boolean checkUsingStack(String original) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < original.length(); i++) {
            stack.push(original.charAt(i));
        }

        String reversed = "";

        while (!stack.isEmpty()) {
            reversed = reversed + stack.pop();
        }

        return original.equals(reversed);
    }

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println(" UC13: Performance Comparison       ");
        System.out.println("====================================");

        String test = "madam";

        // Reverse method timing
        long start1 = System.nanoTime();
        boolean result1 = checkUsingReverse(test);
        long end1 = System.nanoTime();

        // Char array method timing
        long start2 = System.nanoTime();
        boolean result2 = checkUsingCharArray(test);
        long end2 = System.nanoTime();

        // Stack method timing
        long start3 = System.nanoTime();
        boolean result3 = checkUsingStack(test);
        long end3 = System.nanoTime();

        // Display results
        System.out.println("Reverse Method Result: " + result1);
        System.out.println("Execution Time: " + (end1 - start1) + " ns");

        System.out.println();

        System.out.println("Char Array Method Result: " + result2);
        System.out.println("Execution Time: " + (end2 - start2) + " ns");

        System.out.println();

        System.out.println("Stack Method Result: " + result3);
        System.out.println("Execution Time: " + (end3 - start3) + " ns");

        System.out.println("====================================");
    }
}