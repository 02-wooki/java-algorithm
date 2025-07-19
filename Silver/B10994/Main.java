package Backjoon.Silver.B10994;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if (n == 1) {
            System.out.println('*');
            return;
        }

        for (int i = 0; i < (n - 1) * 2; i++) {
            for (int j = 0; j < n * 4 - 3; j++) {
                if (i % 2 == 1) {
                    if (j == 0 || j == n * 4 - 4)
                        System.out.print("*");
                    else if (j < i || j > n * 4 - 4 - i)
                        System.out.print(j % 2 == 0 ? "*" : " ");
                    else
                        System.out.print(" ");
                } else {
                    if (j < i || j > n * 4 - 4 - i)
                        System.out.print(j % 2 == 0 ? "*" : " ");
                    else
                        System.out.print("*");
                }
            }
            System.out.println();
        }
        for (int i = 0; i < n * 4 - 3; i++)
            System.out.print(i % 2 == 0 ? "*" : " ");
        System.out.println();
        for (int i = (n - 1) * 2 - 1; i >= 0; i--) {
            for (int j = 0; j < n * 4 - 3; j++) {
                if (i % 2 == 1) {
                    if (j == 0 || j == n * 4 - 4)
                        System.out.print("*");
                    else if (j < i || j > n * 4 - 4 - i)
                        System.out.print(j % 2 == 0 ? "*" : " ");
                    else
                        System.out.print(" ");
                } else {
                    if (j < i || j > n * 4 - 4 - i)
                        System.out.print(j % 2 == 0 ? "*" : " ");
                    else
                        System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
