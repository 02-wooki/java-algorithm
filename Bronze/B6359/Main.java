package Backjoon.Bronze.B6359;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] res = new int[101];

        boolean[] isClosed = new boolean[101];
        for (int i = 2; i < 101; i++)
            for (int j = i; j < 101; j += i)
                isClosed[j] = !isClosed[j];

        for (int i = 1; i <= 100; i++)
            res[i] += res[i - 1] + (isClosed[i] ? 0 : 1);

        while (n-- > 0)
            System.out.println(res[in.nextInt()]);
    }
}
