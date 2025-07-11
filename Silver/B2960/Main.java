package Backjoon.Silver.B2960;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), k = in.nextInt();

        boolean[] table = new boolean[n + 1];
        Arrays.fill(table, true);
        for (int i = 2; i <= n; i++) {
            if (!table[i])
                continue;

            for (int j = i; j <= n; j += i) {
                if (table[j]) {
                    if (--k == 0) {
                        System.out.println(j);
                        return;
                    }
                    table[j] = false;
                }
            }
        }
    }
}
