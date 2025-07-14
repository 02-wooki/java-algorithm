package Backjoon.Silver.B1929;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m =  in.nextInt();
        int n = in.nextInt();

        boolean[] table =  new boolean[n + 1];
        Arrays.fill(table, true);

        for (int i = 0; i < 2; i++)
            table[i] = false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            for (int j = i + i; j <= n; j += i)
                table[j] = false;
        }

        for (int i = m; i <= n; i++)
            if (table[i])
                System.out.println(i);
    }
}
