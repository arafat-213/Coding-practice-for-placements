package com.pattern;

import java.util.Scanner;

/*
   $
  $$
 $$$
$$$$
*/
public class Basic3 {
    public static void main(String[] args) {
        int i, j, rows;
        Scanner scanner = new Scanner(System.in);
        rows = scanner.nextInt();
        for (i = 0; i < rows; i++) {
            for (j = 0; j < rows; j++) {
                if (j > rows - 2 - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
