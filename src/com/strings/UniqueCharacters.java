package com.strings;

// Write a function to determine if a string has all unique characters.
// P.S: What if you can't use additional data structures.
public class UniqueCharacters {
    public static void main(String[] args) {
        String str = "abcdefghijklmnopA";
        System.out.println(isUniqueChars(str));
    }

    private static boolean isUniqueChars(String str) {
        if (str.length() > 128)
            // String is longer than expected
            return false;
        // We will keep a boolean array for all 129 valid characters
        // If a character occurs in a string for the first time, we set index of its ASCII value to be true.
        boolean char_set[] = new boolean[128];
        int val;
        for (int i = 0; i < str.length(); i++) {
            val = str.charAt(i);
            if (char_set[val])
                // Ye ho chuka hai
                return false;
            // Character is occurring for first time
            char_set[val] = true;
        }
        return true;
    }
}
