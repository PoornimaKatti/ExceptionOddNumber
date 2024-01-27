package com.java.ExceptionOddNumberExample;
import java.util.Scanner;

public class ExceptionOddNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();
//The trynumber method is then called with the entered integer.
// If the entered number is odd, it will throw an exception,
// and the corresponding error message will be displayed. 
        trynumber(n);

        // Close the scanner to prevent resource leaks
        scanner.close();
    }

    public static void trynumber(int n) {
        try {
            checkEvenNumber(n);
            System.out.println(n + " is even.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void checkEvenNumber(int number) {
        if (number % 2 != 0) {
            throw new IllegalArgumentException(number + " is odd.");
        }
    }
}
