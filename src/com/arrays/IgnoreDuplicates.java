package com.arrays;

public class IgnoreDuplicates {
    public static void main(String[] args) {
        int array[] = {100, 19, 16, 14, 13, 12, 11, 110, 10};
        int count;
        for (int i = 0; i < array.length; i++) {
            count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }
            if (count < 2)
                System.out.println(array[i]);
        }
    }
}
