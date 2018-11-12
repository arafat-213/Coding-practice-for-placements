package com.strings;

public class PalindromeString {
    public static void main(String[] args) {
        // My reaction if they ask such problems in coding tests
        String str = "hahahahah";
        System.out.println(isPalindrome(str));
    }

    private static boolean isPalindrome(String str) {
        if (str.length() == 0 || str.length() == 1)
            // 0 ya 1 character wali string ko check karne wala pagal
            return true;
        for (int i = 0, j = str.length() - 1; i <= j / 2; i++, j--) {
            // No need to use 2 loops while this can be done using single loop only :P
            if (str.charAt(i) != str.charAt(j)) {
                // 1 character mismatch is enough to 'judge' the string as non-palindrome
                return false;
            }
        }
        return true;
    }
}
