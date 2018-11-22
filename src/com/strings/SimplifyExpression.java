package com.strings;

public class SimplifyExpression {
    public static void main(String[] args) {
        String exp = "(X+Y)-(A+B)+(C-D)-(E-F)";
        System.out.println("Input: " + exp);
        String result = "";
        char temp = ' ';
        int k;
        // output should be X+Y-A-B
        for (int i = 1; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            if (ch == '(' && exp.charAt(i - 1) == '-') {
                while (exp.charAt(i) != ')') {
                    if (exp.charAt(i) == '-') {
                        result += '+';
                    } else if (exp.charAt(i) == '+') {
                        result += '-';
                    } else if (exp.charAt(i) != ')' && exp.charAt(i) != '(') {
                        result += exp.charAt(i);
                    }
                    i++;
                }
            } else if (ch == '(' && exp.charAt(i - 1) == '+') {
                while (exp.charAt(i) != ')') {
                    if (exp.charAt(i) != '(' && exp.charAt(i) != ')')
                        result += exp.charAt(i);
                    i++;
                }
            } else if (ch != ')') {
                result += exp.charAt(i);
            }
        }
        System.out.println("Output: " + result);
    }
}