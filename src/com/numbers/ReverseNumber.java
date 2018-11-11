package com.numbers;

public class ReverseNumber {
    public static void main(String[] args) {
        int number = 1234;
        System.out.println("Reverse of " + number + " is: " + reverseNumber(number));
    }

    private static int reverseNumber(int number) {
        int reverse = 0;
        int remainder;
        while (number > 0) {
            remainder = number % 10;
            reverse = reverse * 10;
            reverse = reverse + remainder;
            number = number / 10;
        }
        return reverse;
    }
}
