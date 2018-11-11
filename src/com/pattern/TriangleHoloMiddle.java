package com.pattern;

public class TriangleHoloMiddle {
    public static void main(String[] args) {
        char k;
        for (int i = 1; i <= 4; i++) {
            k = 'A';
            for (int j = 1; j <= 7; j++) {
                if (j <= 5 - i || j >= 3 + i) {
                    System.out.print(k);
                    // j >= 4 ? k++ : k--;
                    k = j < 4 ? (char) (k + 1) : (char) (k - 1);
                } else {
                    System.out.print(" ");
                    if (j == 4)
                        k--;
                }
            }
            System.out.println();
        }
    }
}
