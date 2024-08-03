package Backjoon.Bronze.B2562;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        int maxi = 0;

        for (int i = 0; i < 9; i++) {
            int input = in.nextInt();

            if (input > max) {
                max = input;
                maxi = i + 1;
            }
        }

        System.out.printf("%d\n%d", max, maxi);
    }
}
