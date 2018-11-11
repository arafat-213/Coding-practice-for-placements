package com.pattern;

import java.util.Scanner;

public class SimpleDiamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int k = -1;
        int n = (rows + 1) / 2;
        for (int i = 0; i < rows; i++) {
            if (rows % 2 == 0) {
                if (i <= n) k++;
                if (i > n + 1) k--;
            } else
                k = i >= n ? k - 1 : k + 1;
            for (int j = 0; j < rows; j++) {
                if (j > n - 2 - k && j < n + k) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
