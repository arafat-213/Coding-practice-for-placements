package com.strings;

public class RemoveVowels {
    public static void main(String[] args) {
        String str = "hello world";
        // Iska abhi "hll wrld" hone wala hai.. :3
        System.out.println(removeVowels(str));
    }

    private static String removeVowels(String str) {
        String vowelFree = "";
        char ch;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U') {
                // Do nothing
                // "Sometimes Nothing is the hardest thing to do".  -Tyrion Lanninster (S07E05) {Wow, I need a life}
            } else {
                vowelFree += ch;
            }
        }
        return vowelFree;
    }
}
