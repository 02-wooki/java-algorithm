package Backjoon.Silver.B3036;

import java.util.Scanner;

public class Main {

    static int getGcd(int a, int b) {
        return a % b == 0 ? b : getGcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] rings = new int[n];
        for (int i = 0; i < n; i++)
            rings[i] = in.nextInt();

        int a = 1, b = 1;
        for (int i = 1; i < n; i++) {
            a = rings[0];
            b = rings[i];

            int gcd = getGcd(a, b);

            System.out.println(a / gcd + "/" + b / gcd);
        }
    }
}
