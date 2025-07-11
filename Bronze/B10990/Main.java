package Backjoon.Bronze.B10990;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 0; i < n - 1; i++)
            System.out.print(" ");
        System.out.println("*");

        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= n + i; j++) {
                if (j == n - i || j == n + i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
