package com.random_shit;

public class ParanthesesCheck {
    static char[] stack = new char[100];
    static int top = -1;
    static int size = 100;
    static boolean isValid = true;
    static char temp;

    public static void main(String[] args) {
        String str = "(){[]}{}(())";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[')
                push(ch);
            else if (ch == ')' || ch == '}' || ch == ']') {
                temp = pop();
                System.out.println(temp);
                if (ch == ')' && (temp == '{' || temp == '['))
                    isValid = false;
                else if (ch == '}' && (temp == '(' || temp == '['))
                    isValid = false;
                else if (ch == ']' && (temp == '(' || temp == '{'))
                    isValid = false;
            }
        }
        checkTop();
    }

    static void push(char ch) {
        if (top < size)
            stack[++top] = ch;
    }

    static char pop() {
        if (top > -1)
            return stack[top--];
        else {
            System.out.println("Errr! Invalid");
            System.exit(0);
        }
        return '0';
    }

    static void checkTop() {
        if (top == -1 && isValid)
            System.out.println("Valid");
        else
            System.out.println("Errr! Invalid");
    }
}



