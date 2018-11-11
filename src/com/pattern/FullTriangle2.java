package com.pattern;
/*
        $
       $ $
      $ $ $
     $ $ $ $
    $ $ $ $ $
*/

import java.util.Scanner;

public class FullTriangle2 {
    public static void main(String[] args) {
        int i, j;
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int col = 2 * rows - 1;
        int n = col / 2;
        boolean k = true;
        for (i = 0; i < rows; i++) {
            for (j = 0; j < col; j++) {
                if (j >= n - 1 - i && j <= n + 1 + i && k) {
                    System.out.print("$");
                    k = !k;
                } else {
                    System.out.print(" ");
                    k = !k;
                }
            }
            System.out.println();
        }
    }
}
