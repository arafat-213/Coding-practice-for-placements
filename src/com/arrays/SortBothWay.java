package com.arrays;

import java.util.Arrays;

public class SortBothWay {
    public static void main(String[] args) {
        int array[] = {1, 3, 2, 5, 4, 6, 2, 9, 5};
        System.out.println(Arrays.toString(ascending(array)));
        System.out.println(Arrays.toString(descending(array)));
    }

    private static int[] ascending(int[] array) {
        int temp;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    private static int[] descending(int[] array) {
        /* Sirf print karana ho and array ascending sort me avail ho to ye method
        int index = 0;
        int [] newArray = new int[array.length];
        for(int i=array.length-1; i>=0; i--) {
            newArray[index++] = array[i];
        }
        return newArray;*/
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j + 1] > array[j]) {
                    temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
