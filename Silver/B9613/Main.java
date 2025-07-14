package Backjoon.Silver.B9613;

import java.util.Scanner;

public class Main {

    static long getGcd(int a, int b) {
        if (a % b == 0)
            return b;
        return getGcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while (t-- > 0) {
            int[] list = new int[in.nextInt()];
            for (int i = 0; i < list.length; i++)
                list[i] = in.nextInt();

            long sumGcd = 0;
            for (int i = 0; i < list.length - 1; i++)
                for (int j = i + 1; j < list.length; j++)
                    sumGcd += getGcd(list[i], list[j]);

            System.out.println(sumGcd);
        }
    }
}
