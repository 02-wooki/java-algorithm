package Backjoon.Silver.B1747;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    static List<Integer> getPrime(int min) {
        List<Integer> primes = new ArrayList<>();
        boolean[] isNotPrime = new boolean[10000001];

        for (int i = 2; i * i < isNotPrime.length; i++) {
            if (isNotPrime[i])
                continue;

            for (int j = i + i; j < isNotPrime.length; j += i)
                isNotPrime[j] = true;
        }

        for (int i = Math.max(min, 2); i < isNotPrime.length; i++)
            if (!isNotPrime[i])
                primes.add(i);

        return primes;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        List<Integer> primes = getPrime(n);
        for (int i: primes) {
            String s = Integer.toString(i);
            boolean isPalindrome = true;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) != s.charAt(s.length() - j - 1)) {
                    isPalindrome = false;
                    break;
                }
            }

            if (!isPalindrome)
                continue;

            System.out.println(i);
            break;
        }
    }
}
