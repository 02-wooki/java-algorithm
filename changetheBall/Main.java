package Backjoon.changetheBall;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int size = in.nextInt();
        int m = in.nextInt();
        int[] baguni = new int[size];

        for (int i = 0; i < baguni.length; i++)
            baguni[i] = i + 1;

        for (int i = 0; i < m; i++) {
            int x = in.nextInt() -1;
            int y = in.nextInt() -1;

            int tmp = baguni[x];
            baguni[x] = baguni[y];
            baguni[y] = tmp;
        }

        for (int i :baguni) {
            System.out.printf("%d ", i);
        }


    }
}
