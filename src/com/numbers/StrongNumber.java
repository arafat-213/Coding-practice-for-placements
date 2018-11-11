package com.numbers;

public class StrongNumber {
    public static void main(String[] args) {
        // A number is strong if the sum of factorial of the digits in any number is equal the given number
        // eg. 145: 1! + 4! + 5! = 145.. Hence 145 is a strong number
        int number = 145;
        if (checkStrong(number))
            System.out.println("Stronggggg");
        else
            System.out.println("Try harder");
    }

    private static boolean checkStrong(int number) {
        int temp = number;
        int remainder;
        int sum = 0;
        while (temp > 0) {
            remainder = temp % 10;
            sum = sum + findFactorial(remainder);
            temp = temp / 10;
        }
        return sum == number;
    }

    private static int findFactorial(int number) {
        int factorial = 1;
        for (int i = 2; i <= number; i++)
            factorial = factorial * i;
        return factorial;
    }
}
