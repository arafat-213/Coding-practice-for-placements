package com.strings;

public class StringReverse {
    public static void main(String[] args) {
        String str = "hello";
        System.out.println(reverse(str));
    }

    private static String reverse(String str) {
        String reverse = "";
//        StringBuilder sb = new StringBuilder(str);
//        reverse = sb.reverse().toString();
// OR
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return reverse;
//       OR
// return new StringBuilder(str).reverse().toString();
    }
}