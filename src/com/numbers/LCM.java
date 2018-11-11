package com.numbers;

public class LCM {
    public static void main(String[] args) {
        int no1 = 11, no2 = 17;
        int gcd = findGCD(no1, no2);
        System.out.println("LCM of " + no1 + " and " + no2 + " is: " + LCMfromGCD(no1, no2, gcd));
        System.out.println("LCM of " + no1 + " and " + no2 + " is: " + LCMfromFaltuMethod(no1, no2));
    }

    private static int findGCD(int no1, int no2) {
        int gcd = 1;
        for (int i = 1; i <= no1 && i <= no2; i++)
            if (no1 % i == 0 && no2 % i == 0)
                gcd = i;
        return gcd;
    }

    //The easy way
    private static int LCMfromGCD(int no1, int no2, int gcd) {
        int lcm;
        // Formula : no1*no2 = LCM(no1,no2) * GCD(no1, no2)
        // => LCM(no1, no2) = (no1*no2)/GCD(no1,no2)
        lcm = (no1 * no2) / gcd;
        return lcm;
    }

    // Faltu way
    private static int LCMfromFaltuMethod(int no1, int no2) {
        int max = no1 > no2 ? no1 : no2;
        int lcm = max;
        while (true) {
            if (lcm % no1 == 0 && lcm % no2 == 0) {
                return lcm;
            }
            lcm += max;
        }
    }
}
