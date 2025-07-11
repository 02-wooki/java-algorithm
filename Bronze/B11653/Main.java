package Backjoon.Bronze.B11653;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if (n == 1)
            return;

        List<Integer> sosus = new ArrayList<>();
        boolean[] table = new boolean[n + 1];
        Arrays.fill(table, true);

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (!table[i])
                continue;

            sosus.add(i);
            for (int j = i + i; j <= n; j += i)
                table[j] = false;
        }

        while (!table[n]) {
            for (Integer i: sosus) {
                if (n % i == 0) {
                    System.out.println(i);
                    n /= i;
                    break;
                }
            }
        }
        System.out.println(n);
    }
}
