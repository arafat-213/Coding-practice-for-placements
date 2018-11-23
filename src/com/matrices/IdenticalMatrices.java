package com.matrices;

public class IdenticalMatrices {
    public static void main(String[] args) {
        int array1[][] = {{1, 2, 3}, {2, 3, 4, 0}};
        int array2[][] = {{1, 2, 4}, {2, 3, 4, 0, 0}};
        System.out.println(isIdentical(array1, array2));
    }

    private static boolean isIdentical(int[][] array1, int[][] array2) {
        boolean isIdentical = true;
        if (array1.length != array2.length)
            return false;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                if (array1[i].length != array2[i].length)
                    return false;
                if (array1[i][j] != array2[i][j])
                    isIdentical = false;
            }
        }
        return isIdentical;
    }
}
