package Backjoon.Bronze.B10996;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if (n == 1) {
            System.out.println("*");
            return;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++)
                System.out.print("* ");
            System.out.print(n % 2 == 1 ? "*\n " : "\n ");
            for (int j = 0; j < n / 2; j++)
                System.out.print("* ");
            System.out.println();
        }
    }
}
