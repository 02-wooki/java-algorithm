package Backjoon.constant;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a = readSangsu(in.nextInt());
        int b = readSangsu(in.nextInt());

        System.out.println(a > b ? a : b);

    }

    public static int readSangsu(int n) {

        int one = n % 10;
        int hund = n / 100;

        n -= one + (hund * 100);
        n += (one * 100) + hund;

        return n;
    }
}
