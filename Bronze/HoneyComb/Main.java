package Backjoon.Bronze.HoneyComb;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        // 1: 1
        // 2 ~ 7: 2     // 2부터 7까지 6개
        // 8 ~ 19: 3    // 8부터 19까지 12개
        // 20 ~ 37: 4   // 20부터 37까지 18개
        // 38 ~ 61: 5   // 38부터 61까지 24개
        int count = 1, room = 1;
        while (room < n) {
            room += count * 6;
            count++;
        }

        System.out.println(count);
    }
}
