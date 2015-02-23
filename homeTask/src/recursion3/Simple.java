package recursion3;

import java.util.Scanner;

/**
 * Created by Liberstina on 21.02.2015.
 */
public class Simple {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        Simple prime = new Simple();
        prime.checkNumbers(n);

    }

    void checkNumbers(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i, i-1)) {
                System.out.print(" " + i);
            }
        }
    }

    boolean isPrime(int p, int k) {
        if (k == 1) return true;
        if (p % k != 0) return isPrime(p, k - 1);
        else
            return false;


    }
}
