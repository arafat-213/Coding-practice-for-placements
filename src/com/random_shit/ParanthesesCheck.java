package com.random_shit;

public class ParanthesesCheck {
    static char[] stack = new char[100];
    static int top = -1;
    static int size = 100;

    public static void main(String[] args) {
        String str = "((())))()(())";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(')
                push('(');
            else if (str.charAt(i) == ')')
                pop();
        }
        checkTop();
    }

    static void push(char ch) {
        if (top < size)
            stack[++top] = ch;
    }

    static void pop() {
        if (top > -1)
            top--;
        else {
            System.out.println("Errr! Invalid");
            System.exit(0);
        }
    }

    static void checkTop() {
        if (top == -1)
            System.out.println("Valid");
        else
            System.out.println("Errr! Invalid");
    }
}



