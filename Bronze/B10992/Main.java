package Backjoon.Bronze.B10992;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 1; i < n; i++)
            System.out.print(" ");
        System.out.println("*");

        for (int i = 0; i < n - 2; i++) {
            for (int j = 1; j < n + i + 1; j++) {
                System.out.print(j == n - i - 1 ? "*": " ");
            }
            System.out.println("*");
        }

        for (int i = 0; i < n * 2 - 1 && n != 1; i++)
            System.out.print("*");
    }
}
