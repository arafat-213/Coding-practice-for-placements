package com.strings;

public class SimplifyExpression {
    public static void main(String[] args) {
        String exp = "(X+Y)-(A+B)";
        String result = "";
        char temp = ' ';
        int k;
        // output should be X+Y-A-B
        for (int i = 1; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            if (ch == '(' && exp.charAt(i - 1) == '-') {
                k = i;
                while (temp != ')') {
                    if (k >= exp.length()) {
                        System.out.print("Invalid syntax");
                        break;
//                        System.exit(0);
                    }
                    temp = exp.charAt(k);
                    k++;
                    System.out.println(k);
                }
                // System.out.println(k);
                for (int j = i; j < k; j++) {
                    ch = exp.charAt(j);
                    if (exp.charAt(j) == '+') {
                        ch = '-';
                    }
                    result += ch;
                }
            } else if (ch == '(' || ch == ')') {
                // do nothingg
            } else {
                result += ch;
            }
        }
        System.out.println(result);
    }
}
