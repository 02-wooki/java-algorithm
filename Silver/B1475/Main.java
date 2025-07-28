package Backjoon.Silver.B1475;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();

        int[] table = new int[10];
        while (x > 0) {
            table[x % 10]++;
            x /= 10;
        }

        table[6] = (table[6] + table[9] + 1) / 2;
        int max = 0;
        for (int i = 0; i < 9; i++)
            max = Math.max(max, table[i]);

        System.out.println(max);
    }
}
