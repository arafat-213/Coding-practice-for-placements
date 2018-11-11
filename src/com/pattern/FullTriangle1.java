package com.pattern;

import java.util.Scanner;

/*
 *
 ***
 *****
 *******
 *********
 */
public class FullTriangle1 {
    public static void main(String[] args) {
        int i, j;
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int col = 2 * rows - 1;
        int n = col / 2;
        for (i = 0; i < rows; i++) {
            for (j = 0; j < col; j++) {
                if (j > n - 1 - i && j < n + 1 + i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
