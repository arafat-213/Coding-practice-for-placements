package com.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class FindDistinctNumbers {
    public static void main(String[] args) {
        int[] array = {1, 1, 6, 0, 2, 8, 6};
        ArrayList<Integer> distinctNumbers = new ArrayList<Integer>();
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
//            System.out.println("Kya pata");
            if (checkUnique(array[i], array, i)) {
//                System.out.println("Hi there");
                distinctNumbers.add(array[i]);
            }
        }
        System.out.println(distinctNumbers.size());
        for (int i = 0; i < distinctNumbers.size(); i++) {
//            System.out.println("Helllooooo");
            System.out.println(distinctNumbers.get(i));
        }
    }

    public static boolean checkUnique(int n, int[] arr, int arrayIndex) {
        boolean isUnique = true;
        for (int i = arrayIndex + 1; i < arr.length; i++) {
            if (arr[i] == n) {
                isUnique = false;
//                break;
            }
        }
        return isUnique;
    }
}
