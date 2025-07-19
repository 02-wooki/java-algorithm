package Backjoon.Silver.B9020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    static final int max = 10000;

    static List<Integer> getPrimes() {
        List<Integer> primes = new ArrayList<>();
        boolean[] isPrime = new boolean[max + 1];
        Arrays.fill(isPrime, true);

        for (int i = 2; i * i <= max; i++) {
            if (!isPrime[i]) continue;
            for (int j = i * i; j <= max; j += i)
                isPrime[j] = false;
        }

        for (int i = 2; i < max + 1; i++)
            if (isPrime[i])
                primes.add(i);

        return primes;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t =  in.nextInt();

        List<Integer> primes = getPrimes();

        while (t-- > 0) {
            int n = in.nextInt();
            int i = 0, j = primes.size() - 1;
            int latestI = i, latestJ = j;

            // j 초기 위치 찾기
            while (primes.get(j) >= n)
                j--;

            while (i <= j) {
                if (primes.get(i) + primes.get(j) > n)
                    j--;
                else if (primes.get(i) + primes.get(j) < n)
                    i++;
                else {
                    latestI = i;
                    latestJ = j;
                    i++;
                }
            }

            System.out.println(primes.get(latestI) + " " + primes.get(latestJ));
        }
    }
}
