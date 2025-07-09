package Backjoon.Bronze.B2576;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0, smallest = 100;
        for (int i = 0; i < 7; i++) {
            int n = in.nextInt();

            if (n % 2 == 1) {
                sum += n;
                if (smallest > n)
                    smallest = n;
            }
        }

        if (sum == 0)
            System.out.println(-1);
        else {
            System.out.println(sum);
            System.out.println(smallest);
        }
    }
}
