package com.numbers;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean isPrime = true;
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime)
            System.out.println("1");
        else
            System.out.println("0");
    }
}
