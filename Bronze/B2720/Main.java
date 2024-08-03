package Backjoon.Bronze.B2720;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] change = {25, 10, 5, 1};

        for (int i = 0; i < n; i++) {
            int money = in.nextInt();
            int[] thistimeChange = new int[4];
            int changeIndex = 0;
            while (money > 0) {
                if (change[changeIndex] > money)
                    changeIndex++;
                else {
                    money -= change[changeIndex];
                    thistimeChange[changeIndex]++;
                }
            }

            for (int i1 : thistimeChange)
                System.out.printf("%d ", i1);
            System.out.println();
        }

    }
}
