package Backjoon.Bronze.B10991;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 0; i < n - 1; i++)
            System.out.print(" ");
        System.out.println("*");

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 2; j++)
                System.out.print(" ");
            for (int j = 0; j <= i + 1; j++)
                System.out.print("* ");
            System.out.println();
        }
    }
}
