package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

// Sort first K elements of an array in ascending order and rest of the element in descending order
public class SortFirstKNummbers {
    public static void main(String[] args) {
        int array[] = {1, 4, 2, 0, 8, 0, 6, 4, 7};
        int temp;
        Scanner scanner = new Scanner(System.in);
        int k = 4;
        if (k > array.length) {
            System.out.println("Invalid input");
            return;
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < k; j++) {
                //Sort k elements in ascending order
                if (array[j - 1] > array[j]) {
                    temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }

            for (int a = k + 1; a < array.length; a++) {
                // Sort n-k elements in descending order
                if (array[a - 1] < array[a]) {
                    temp = array[a];
                    array[a] = array[a - 1];
                    array[a - 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
