package Backjoon.AplusBminusC;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();

        int blen = String.valueOf(b).length();

        System.out.println(a + b - c);

        for (int i = 0; i < blen; i++) {
            a *= 10;
        }

        System.out.println(a + b - c);
    }
}
