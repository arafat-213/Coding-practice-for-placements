package matrices;

public class SpiralPrint {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 0}, {0, 4, 5, 6}, {3, 7, 8, 9}, {9, 0, 1, 2}};
        int rows = matrix.length;
        int col = matrix[0].length;
        System.out.println("Ye hai aam zindagi:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.print("Ye hai mentos zindagi: ");
        printSpiral(matrix, rows, col);
    }

    private static void printSpiral(int matrix[][], int rows, int col) {
        int top, bottom, left, right;
        int direction = 1;
        /* Directions:  1-> left to right
                        2-> top to bottom
                        3-> right to left
                        4-> bottom to top
                        */
        top = 0;
        left = 0;
        bottom = rows - 1;
        right = col - 1;
        int i;
        while (top <= bottom && left <= right) {
            if (direction == 1) {
                // Going left to right
                for (i = left; i <= right; i++)
                    System.out.print(matrix[top][i] + " ");
                // After traversing a top most row, we increment top to never come back to this row again
                top++;
                // And we will change direction from 1 to 2
                direction = 2;
            } else if (direction == 2) {
                // Going top to bottom
                for (i = top; i <= bottom; i++)
                    System.out.print(matrix[i][right] + " ");
                // After traversing a right most column, we decrement right to never come back to this column again
                right--;
                direction = 3;
            } else if (direction == 3) {
                // Going right to left
                for (i = right; i >= left; i--)
                    System.out.print(matrix[bottom][i] + " ");
                // After traversing a bottom most row, we decrement bottom to never come back to this row again
                bottom--;
                direction = 4;
            } else if (direction == 4) {
                // Going bottom to top
                for (i = bottom; i >= top; i--)
                    System.out.print(matrix[i][left] + " ");
                // After traversing a left most column, we increment left to never come back to this column again
                left++;
                direction = 1;
            }
        }
    }
}
