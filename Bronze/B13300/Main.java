package Backjoon.Bronze.B13300;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] students = new int[2][7];   // [성별][학년]

        int n = in.nextInt(), k = in.nextInt();
        while (n-- > 0)
            students[in.nextInt()][in.nextInt()]++;

        int count = 0;
        for (int[] ii: students)
            for (int i: ii)
                count += Math.ceil((double)i / k);

        System.out.println(count);
    }
}
