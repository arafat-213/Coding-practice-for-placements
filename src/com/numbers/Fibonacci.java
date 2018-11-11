package com.numbers;

public class Fibonacci {
    public static void main(String[] args) {
//        dynamicProgramming(10);
        traditional(10);
        System.out.println(recursiveFibo(10));
    }

    private static void dynamicProgramming(int n) {

        if (n == 0) {
            System.out.println("1");
        } else if (n == 1) {
            System.out.println("1 ,1");
        } else {
            int[] array = new int[n + 1];
            array[0] = 0;
            array[1] = 1;
            for (int i = 2; i <= n; i++) {
                array[i] = array[i - 1] + array[i - 2];
            }

            for (int i = 0; i <= n; i++) {
                if (i > 0) {
                    System.out.print(" ,");
                }
                System.out.print(array[i]);
            }
        }
    }

    private static void traditional(int n) {
//        int secondPrevious = 0, previous = 1, current;
        int n1 = 0, n2 = 1, n3 = 0;
        int count = 2;
        System.out.print(n1 + " ," + n2);
        while (count <= n) {
            n3 = n1 + n2;
//            current = secondPrevious + previous;
            System.out.print(" ,");
            System.out.print(n3);
            n1 = n2;
            n2 = n3;
//            secondPrevious = previous;
//            previous = current;
            count++;
        }
    }

    private static int recursiveFibo(int n) {
        return n <= 1 ? n : recursiveFibo(n - 1) + recursiveFibo(n - 2);
    }
}
