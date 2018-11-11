package com.numbers;

public class PalindromeNumber {
    public static void main(String[] args) {
        int number = 1221;
        System.out.println(number + " is a palindrome: " + isPalindrome(number));
    }

    private static boolean isPalindrome(int n) {
        int remainder, reverse = 0, number = n;
        while (number > 0) {
            remainder = number % 10;
            reverse = reverse * 10;
            reverse = reverse + remainder;
            number = number / 10;
        }
        return reverse == n;
    }
}
