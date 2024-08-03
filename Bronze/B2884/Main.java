package Backjoon.Bronze.B2884;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int hour = in.nextInt();
        int minute = in.nextInt();

        if (minute < 45) {
            hour--;
            minute += 60;
        }
        if (hour < 0)
            hour += 24;

        System.out.printf("%d %d", hour, minute - 45);
    }
}
