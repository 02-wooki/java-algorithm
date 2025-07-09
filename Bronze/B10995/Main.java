package Backjoon.Bronze.B10995;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print(i % 2 == 0 ? "" : " ");
            for (int j = 0; j < n; j++)
                System.out.print("* ");
            System.out.println();
        }
    }
}
