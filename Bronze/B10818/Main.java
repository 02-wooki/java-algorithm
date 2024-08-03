package Backjoon.Bronze.B10818;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int x = in.nextInt();

            if (min > x)
                min = x;
            if (max < x)
                max = x;
        }

        System.out.printf("%d %d", min, max);

    }
}
