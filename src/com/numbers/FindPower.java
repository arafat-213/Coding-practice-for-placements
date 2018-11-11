package com.numbers;

public class FindPower {
    public static void main(String[] args) {
        // Find power of a number
        int number = 3;
        int pow = 3;
        System.out.println(power(number, pow));
    }

    public static int power(int n, int m) {
        int ans = 0;
        for (int i = 0; i < m; i++) {
            ans += n * n;
        }
        return ans;
    }
}
