package Backjoon.Silver.B11047;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] coins = new int[in.nextInt()];
        int k = in.nextInt();

        for (int i = 0; i < coins.length; i++)
            coins[i] = in.nextInt();

        int p = coins.length - 1, count = 0;
        while (k > 0) {
            count += k / coins[p];
            k %= coins[p--];
        }

        System.out.println(count);
    }
}
