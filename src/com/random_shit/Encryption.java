package com.random_shit;

/*Bob has to send a secret code S to his boss.
He designs a method to encrypt the code using two key values N and M.
The formula that he uses to develop the encrypted code is shown below:
(((S^N%10)^M)%1000000007)
Write an algorithm to help Bob to encrypt the code.*/
public class Encryption {
    public static void main(String[] args) {
        System.out.println(encrypt(2, 3, 12));
    }

    private static long encrypt(long s, long n, long m) {
        long ans = 0;
        ans = (long) Math.pow(s, n);
        ans = ans % 10;
        ans = (long) Math.pow(ans, m);
        ans = ans % 1000000007;
        return ans;
    }
}
