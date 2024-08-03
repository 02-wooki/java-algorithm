package Backjoon.Bronze.DispersiveProcessing;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            int num = in.nextInt(), times = in.nextInt();
            int multiplier = num % 10;

            for (int j = 0; j < times - 1; j++) {
                num = (multiplier * num) % 10;
            }

            System.out.println(num % 10 == 0 ? 10 : num % 10);
        }
    }
}
