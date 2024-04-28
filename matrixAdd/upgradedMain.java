package Backjoon.matrixAdd;

import java.util.Scanner;

public class upgradedMain {
    public static void main(String[] args) {

        // 시간복잡도 및 공간복잡도 다소 개선된 코드

        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = in.nextInt();

        int[] x = new int[n * m];

        for (int i = 0; i < n * m; i++)
            x[i] = in.nextInt();

        for (int i = 0; i < n * m; i++) {
            System.out.printf("%d%s", x[i] + in.nextInt(), i % m == m-1? "\n" : " ");
        }
    }
}
