package Backjoon.CountNumber;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] x = String.valueOf(in.nextInt() * in.nextInt() * in.nextInt()).toCharArray();
        int[] b = new int[10];

        for (char c : x)
            b[c - '0']++;

        for (int i : b)
            System.out.println(i);

    }
}
