package com.numbers;

public class NumberToDigits {
    public static void main(String[] args) {
        // Count number of digits in a number
        // Sum of all digits in a number
        int number = 120983;
        int sum = 0, remainder = 0;
        int temp = 0;
        int counter = 0;
        while (number > 0) {
            temp = number % 10;
            sum += temp;
            System.out.println(temp);
            number = number / 10;
            counter++;
        }
        System.out.println("Number of digits: " + counter);
        System.out.println("Sum of all digits: " + sum);
        System.out.println("Reverse of 123: " + reverseNumber(123));
//        System.out.println(temp);
       /*
       PLEASE ARFEE YE USE MAT KARNA
        char digit;
        String no = ""+number;
        for(int i=0; i< no.length(); i++) {
            digit = no.charAt(i);
            System.out.println(digit);
        }*/
    }

    private static int reverseNumber(int number) {
        int reverse = 0;
        int remainder;
        while (number > 0) {
            remainder = number % 10;
            reverse = reverse * 10;
            reverse += remainder;
            number = number / 10;
        }
        return reverse;
    }
}
