package Backjoon.Bronze.B2775;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int dataSet = in.nextInt();

        for (int m = 0; m < dataSet; m++) {
            int floor = in.nextInt(), room = in.nextInt();

            int[][] living = new int[floor + 1][room + 1];
            for (int i = 0; i <= room; i++)
                living[0][i] = i;

            for (int i = 1; i < floor + 1; i++)
                for (int j = 0; j < room + 1; j++)
                    living[i][j] = sum(Arrays.copyOf(living[i - 1], j + 1));

            System.out.println(living[floor][room]);
        }
    }

    public static int sum(int[] arr) {
        int s = 0;

        for (int i : arr)
            s += i;

        return s;
    }
}
