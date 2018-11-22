package com.arrays;

import java.util.HashMap;

public class DistinctElements {


    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 4, 5, 1};
//        printUsingHash(array);
        printUsingLoops(array);
    }

    private static void printUsingLoops(int[] array) {
        // Prints redundant elements only Once
        int j;
        for (int i = 0; i < array.length; i++) {
            // check if the element is already printed
            for (j = 0; j < i; j++) {
                if (array[i] == array[j])
                    break;
            }
            // If not printed earlier, then print it
            if (i == j)
                System.out.println(array[i]);
        }
    }

    private static void printUsingHash(int[] array) {
        // Print redundant elements only once.
        HashMap map = new HashMap();
        for (int i = 0; i < array.length; i++) {
            if (!map.containsKey(array[i])) {
                System.out.println(array[i]);
            }
            map.put(array[i], true);
        }
    }
}
