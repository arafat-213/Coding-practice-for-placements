package com.numbers;

public class GCD {
    public static void main(String[] args) {
        int no1 = 12, no2 = 42;
        System.out.println(findGCD(no1, no2));
    }

    private static int findGCD(int no1, int no2) {
        int gcd = 1;
        for (int i = 1; i <= no1 && i <= no2; i++) {
            if (no1 % i == 0 && no2 % i == 0)
                gcd = i;
        }
        return gcd;
    }
}
