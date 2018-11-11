package com.numbers;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if (checkArmStrong(number))
            System.out.println("ArmSTRONG");
        else
            System.out.println("Try harder");
    }

    private static int countNumberOfDigits(int number) {
        int count = 0;
        int remainder = 0;
        while (number > 0) {
            remainder = number % 10;
            count++;
//            System.out.println(remainder);
            number = number / 10;
        }
//        System.out.println("Digits count ho gaye "+ count);
        return count;
    }

    private static boolean checkArmStrong(int number) {
        int numOfDigits = countNumberOfDigits(number);
        int ans = 0;
        int temp = number;
        int remainder = 0;
        while (temp > 0) {
//          System.out.println("Yahan aaya");
            remainder = temp % 10;
            ans += Math.pow(remainder, numOfDigits);
//          System.out.println(ans+" ");
            temp = temp / 10;
        }
        return number == ans;
    }
}
