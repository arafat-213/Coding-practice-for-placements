package com.random_shit;

/*
* The idea is to use square sum relation of Pythagorean triplet,
* i.e., addition of squares of a and b is equal to square of c,
* we can write these number in terms of m and n such that,
* a = m^2 - n^2
       b = 2 * m * n
       c  = m^2 + n^2
because,
       a^2 = m^4 + n^4 – 2 * m^2 * n^2
       b^2 = 4 * m^2 * n^2
       c^2 = m^4 + n^4 + 2* m^2 * n^2
       */
public class PythgoreanTriplets {
    public static void main(String[] args) {
        int n = 20;
        printTriplets(n);
    }

    private static void printTriplets(int limit) {
        int a, b, c = 0;
        int m = 2, n;

        while (c < limit) {
            // This is  the  most optimal solution
            // Time complexity O(k) where k is number of triplets to be printed
            for (n = 1; n < m; n++) {
                a = m * m - n * n;
                b = 2 * m * n;
                c = m * m + n * n;
                if (c > limit)
                    break;
                System.out.println(a + " " + b + " " + c);
            }
            m++;
        }
    }
}
