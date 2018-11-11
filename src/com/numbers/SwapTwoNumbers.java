package com.numbers;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        // Swap two numbers without 3rd variable
        int a = 10;
        int b = 5;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a + " " + b);
    }
}
