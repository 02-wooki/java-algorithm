package Backjoon.Bronze.average;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] scores = new int[n];

        double fixedSum = 0.0;

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            scores[i] = in.nextInt();
            if (max < scores[i])
                max = scores[i];
        }

        for (int i : scores)
            fixedSum += (double) i /max * 100;


        System.out.println(fixedSum/n);

    }
}
