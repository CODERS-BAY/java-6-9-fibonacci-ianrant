package com.codersbay;

import java.util.Scanner;


public class Fibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter an int value. You will get the Fibonacci of your input:");
        int input = scanner.nextInt();

        System.out.println("Your Fibonacci number is:");
        System.out.println(fibonacci(10));

    }
    public static int fibonacci(int n) {
        if (n <2) {
            return n;
        }
        else {
            return (fibonacci(n-1) + fibonacci(n-2));
        }
    }
}
