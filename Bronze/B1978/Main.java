package Backjoon.Bronze.B1978;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] data = new int[n];
        for (int i = 0; i < n; i++)
            data[i] = in.nextInt();

        boolean[] table = eratosthenes(max(data));

        int primeCount = 0;
        for (int i : data) {
            if (table[i])
                primeCount++;
        }

        System.out.println(primeCount);
    }

    public static int max(int[] arr) {
        int m = Integer.MIN_VALUE;
        for (int i : arr)
            if (i > m)
                m = i;

        return m;
    }

    public static boolean[] eratosthenes(int size) {
        boolean[] isPrime = new boolean[size + 1];
        for (int i = 2; i < isPrime.length; i++)
            isPrime[i] = true;

        for (int i = 2; i < Math.sqrt(isPrime.length)+1; i++) {
            if (isPrime[i])
                for (int j = 2; i * j < size + 1; j++)
                    isPrime[i * j] = false;
        }

        return isPrime;
    }
}
