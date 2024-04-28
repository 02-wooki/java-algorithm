package Backjoon.matrixAdd;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = in.nextInt();

        int[][] x = new int[n][m];
        int[][] y = new int[n][m];

        arrInputInit(x, in);
        arrInputInit(y, in);

        add(x, y);
        prtArr(x);

    }

    static void arrInputInit(int[][] arr, Scanner in) {
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[i].length; j++)
                arr[i][j] = in.nextInt();
    }

    static void add(int[][] x, int[][] y) {
        for (int i = 0; i < x.length; i++)
            for (int j = 0; j < x[i].length; j++)
                x[i][j] += y[i][j];
    }

    static void prtArr(int[][] arr) {
        for (int[] ii : arr) {
            for (int i : ii)
                System.out.printf("%d ", i);
            System.out.println();
        }
    }
}
