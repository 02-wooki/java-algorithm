package Backjoon.Bronze.B2566;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        int maxRow = 0, maxCol = 0;
        int nowRow = 1;

        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            Scanner lin = new Scanner(in.nextLine());
            int nowCol = 1;
            while (lin.hasNextInt()) {
                int n = lin.nextInt();
                if (n > max) {
                    max = n;
                    maxRow = nowRow;
                    maxCol = nowCol;
                }
                nowCol++;
            }
            nowRow++;
        }

        System.out.println(max);
        System.out.printf("%d %d\n", maxRow, maxCol);
    }
}
