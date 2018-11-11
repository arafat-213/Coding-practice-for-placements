package com.matrices;

public class MaxZeros {
/*    Given an n-by-n matrix of 0's and 1's where all 1's in each row come before all 0's,
find the most efficient way to return the row with the maximum number of 0's.
  */
    /*
     * 1 1 1 0
     * 1 0 0 0
     * 0 0 0 0  <= Ans = index of this row ie 2
     * 1 1 1 1
     * */

    public static void main(String[] args) {
        int matrix[][] = {{1, 1, 1, 0}, {1, 0, 0, 0}, {0, 0, 0, 0}, {1, 1, 1, 1}};
        int rows = matrix.length;
        int col = matrix[0].length;
        System.out.println(findMaxZeros(matrix, rows, col));
    }

    private static int findMaxZeros(int[][] matrix, int rows, int col) {
        int rowNum = 0;
        int i = 0;
        int j = col - 1;
        while (i < rows && j >= 0) {
            if (matrix[i][j] == 0) {
                j--;
                rowNum = i;
            } else {
                i++;
            }
        }
        return rowNum;
    }
}
