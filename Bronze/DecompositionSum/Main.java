package Backjoon.Bronze.DecompositionSum;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int creater = 1;
        while (decomposit(creater) != n && creater <= n)
            creater++;

        if (decomposit(creater) == n)
            System.out.println(creater);
        else
            System.out.println(0);
    }

    public static int decomposit(int origin) {
        char[] c = String.valueOf(origin).toCharArray();
        int[] decomped = new int[c.length];

        for (int i = 0; i < c.length; i++)
            decomped[i] = c[i] - '0';

        return sum(decomped) + origin;
    }

    public static int sum(int[] arr) {
        int s = 0;
        for (int i : arr) {
            s += i;
        }
        return s;
    }
}
