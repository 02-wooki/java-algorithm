package Backjoon.Silver.B13015;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 0; i < n - 1; i++) {
            String line = "";
            if (i == 0 || i == 2 * (n - 1)) {
                for (int j = 0; j < n; j++)
                    line += "*";
                for (int j = 0; j < 2 * n - 3; j++)
                    line += " ";
                for (int j = 0; j < n; j++)
                    line += "*";
            }
            else {
                for (int j = 0; j < i; j++)
                    line += " ";
                line += "*";
                for (int j = 0; j < n - 2; j++)
                    line += " ";
                line += "*";
                for (int j = 0; j < 2 * n - 3 - i * 2; j++)
                    line += " ";
                line += "*";
                for (int j = 0; j < n - 2; j++)
                    line += " ";
                line += "*";
            }
            System.out.println(line);
        }

        String mid = "";
        for (int i = 0; i < n - 1; i++)
            mid += " ";
        mid += "*";
        for (int i = 0; i < n - 2; i++)
            mid += " ";
        mid += "*";
        for (int i = 0; i < n - 2; i++)
            mid += " ";
        mid += "*";
        System.out.println(mid);

        for (int i = n - 2; i >= 0; i--) {
            String line = "";
            if (i == 0) {
                for (int j = 0; j < n; j++)
                    line += "*";
                for (int j = 0; j < 2 * n - 3; j++)
                    line += " ";
                for (int j = 0; j < n; j++)
                    line += "*";
            }
            else {
                for (int j = 0; j < i; j++)
                    line += " ";
                line += "*";
                for (int j = 0; j < n - 2; j++)
                    line += " ";
                line += "*";
                for (int j = 0; j < 2 * n - 3 - i * 2; j++)
                    line += " ";
                line += "*";
                for (int j = 0; j < n - 2; j++)
                    line += " ";
                line += "*";
            }
            System.out.println(line);
        }
    }
}
