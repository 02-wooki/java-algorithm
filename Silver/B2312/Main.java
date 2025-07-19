package Backjoon.Silver.B2312;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    static final int MAX = 100000;

    static List<Integer> getPrimes() {
        List<Integer> primes = new ArrayList<>();
        boolean[] isPrime = new boolean[MAX + 1];
        Arrays.fill(isPrime, true);

        for (int i = 2; i * i < isPrime.length; i++) {
            if (!isPrime[i]) continue;
            for (int j = i + i; j < isPrime.length; j += i)
                isPrime[j] = false;
        }

        for (int i = 2; i < isPrime.length; i++)
            if (isPrime[i]) primes.add(i);

        return primes;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        List<Integer> primes = getPrimes();

        while (t-- > 0) {
            int n = in.nextInt();
            int[] count = new int[primes.size()];

            for (int i = 0; i < primes.size(); i++) {
                while (n % primes.get(i) == 0) {
                    n /= primes.get(i);
                    count[i]++;
                }
                if (n <= 1)
                    break;
            }

            for (int i = 0; i < primes.size(); i++) {
                if (count[i] != 0)
                    System.out.println(primes.get(i) + " " + count[i]);
            }
        }
    }
}
