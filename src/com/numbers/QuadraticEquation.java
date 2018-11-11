package com.numbers;

public class QuadraticEquation {
    public static void main(String[] args) {
        findRoots(1, -1, -2);
    }

    private static void findRoots(int a, int b, int c) {
        double root1, root2;
        double d = b * b - 4 * a * c;

        if (d > 0) {
            // Roots are real and not equal
            root1 = (-b + Math.sqrt(d)) / (2 * a);
            root2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("root 1: " + root1);
            System.out.println("root 2: " + root2);
        } else if (d == 0) {
            // Roots are real and equal
            root1 = (-b + Math.sqrt(d)) / (2 * a);
            System.out.println("root: " + root1);
        } else {
            // Roots are imaginary
            System.out.println("Try harderrr");
        }
    }
}
