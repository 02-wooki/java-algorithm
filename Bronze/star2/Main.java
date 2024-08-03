package Backjoon.Bronze.star2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i-1; j++) {
                System.out.printf(" ");
            }
            for (int j = i; j <= n; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
