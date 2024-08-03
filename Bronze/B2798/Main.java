package Backjoon.Bronze.B2798;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = in.nextInt();
        int[] cards = new int[n];

        for (int i = 0; i < n; i++)
            cards[i] = in.nextInt();

        int max = 0;
        for (int i = 0; i < cards.length - 2; i++) {
            for (int j = i + 1; j < cards.length - 1; j++) {
                for (int k = j + 1; k < cards.length; k++) {
                    int sum = cards[i] + cards[j] + cards[k];
                    if (sum <= m && sum > max)
                        max = sum;
                }
            }
        }

        System.out.println(max);
    }
}
