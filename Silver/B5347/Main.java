package Backjoon.Silver.B5347;

import java.util.Scanner;

public class Main {

    static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while (n-- > 0) {
            int a = in.nextInt();
            int b = in.nextInt();

            System.out.println((long)a * (long)b / (long)gcd(a, b));
        }
    }
}
