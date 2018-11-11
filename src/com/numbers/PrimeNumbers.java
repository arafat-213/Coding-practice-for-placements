package com.numbers;
// Print all the prime numbers between 1 to N

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean isPrime;
        int number = scan.nextInt();
        for (int i = 2; i <= number; i++) {
            isPrime = true;
            for (int j = 2; j < i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime)
                System.out.println(i);
        }
    }
}
