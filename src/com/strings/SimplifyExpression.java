package com.strings;

public class SimplifyExpression {
    public static void main(String[] args) {
        String exp = "(X+Y)-(A+B)";
        String result = "";
        char temp = ' ';
        int k;
        // output should be X+Y-A-B
        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            if (ch == '-' && exp.charAt(i + 1) == '(') {
                k = i;
                while (temp != ')') {
                    temp = exp.charAt(k);
                    k++;
                    if (k > exp.length() - 2) {
                        System.out.print("Invalid syntax");
                        break;
//                        System.exit(0);
                    }
                }
                for (int j = i; j < temp - 1; j++) {
                    if (exp.charAt(j) == '+') {
                        result += '-';
                    }
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
