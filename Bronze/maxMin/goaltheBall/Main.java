package Backjoon.Bronze.maxMin.goaltheBall;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int baguniLen = in.nextInt();
        int[] baguni = new int[baguniLen];

        for (int i = 0; i < baguni.length; i++) {
            baguni[i] = 0;
        }

        int m = in.nextInt();
        for (int i = 0; i < m; i++) {
            int start = in.nextInt() - 1;
            int end = in.nextInt() - 1;
            int k = in.nextInt();

            for (int j = start; j <= end; j++) {
                baguni[j] = k;
            }
        }

        for (int i :baguni) {
            System.out.printf("%d ", i);
        }


    }
}
