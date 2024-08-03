package Backjoon.Bronze.pactorial2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextInt();

        System.out.println(pact(n));
    }

    public static long pact(long n) {
        if (n == 0)
            return 1;
        else
            return n * pact(n -1);
    }
}