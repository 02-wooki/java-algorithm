package Backjoon.Bronze.B11050;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = in.nextInt();

        System.out.println(pactorial(n) / (pactorial(m) * pactorial(n - m)));
    }

    public static int pactorial(int x) {
        if (x == 0)
            return 1;
        else
            return pactorial(x - 1) * x;
    }
}
