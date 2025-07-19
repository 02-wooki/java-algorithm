package Backjoon.Silver.B10997;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if (n == 1) {
            System.out.println("*");
            return;
        }

        String res = "";
        for (int i = 0; i < 2 * n - 1; i++) {
            if (i == 0) {
                for (int j = 0; j < 4 * n - 3; j++)
                    res += "*";
                res += "\n";
                continue;
            }
            if (i == 1) {
                res += "*\n";
                continue;
            }
            if (i % 2 == 1) {
                for (int j = 0; j < 4 * n - 3; j++) {
                    if (j % 2 == 0 && (j < i || j > 4 * n - 3 - i))
                        res += "*";
                    else
                        res += " ";
                }
                res += "\n";
            } else {
                for (int j = 0; j < 4 * n - 3; j++) {
                    if (j < i || j > 4 * n - 3 - i)
                        res += j % 2 == 0 ? "*" : " ";
                    else
                        res += "*";
                }
                res += "\n";
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4 * n - 3; j++)
                res += j % 2 == 0 ? "*" : " ";
            res += "\n";
        }

        for (int i = 2 * (n - 1); i > 1; i--) {
            if (i % 2 == 0) {
                for (int j = 0; j < 4 * n - 3; j++) {
                    if (j < i || j > 4 * n - 3 - i)
                        res += j % 2 == 0 ? "*" : " ";
                    else
                        res += " ";
                }
            } else {
                for (int j = 0; j < 4 * n - 3; j++) {
                    if (j < i || j > 4 * n - 3 - i)
                        res += j % 2 == 0 ? "*" : " ";
                    else
                        res += "*";
                }
            }
            res += "\n";
        }

        for (int i = 0; i < 4 * n - 3; i++)
            res += "*";
        
        System.out.println(res);
    }
}
