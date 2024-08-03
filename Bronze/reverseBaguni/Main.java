package Backjoon.Bronze.reverseBaguni;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();
        int[] baguni = new int[n + 1];

        for (int i = 0; i < baguni.length; i++) {
            baguni[i] = i;
        }

        for (int i = 0; i < m; i++) {
            reverseArr(baguni, in.nextInt(), in.nextInt());
        }

        for (int i = 1; i < baguni.length; i++) {
            System.out.printf("%d ", baguni[i]);
        }

    }

    public static void reverseArr(int[] arr, int start, int end) {

        for (int i = start; i <= (start + end) / 2; i++) {
            int tmp = arr[i];
            arr[i] = arr[start + (end - i)];
            arr[start + (end - i)] = tmp;
        }

    }
}
