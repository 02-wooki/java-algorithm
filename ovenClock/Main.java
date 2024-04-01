package Backjoon.ovenClock;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int hour = in.nextInt();
        int minute = in.nextInt();
        int clock = in.nextInt();

        minute += clock;
        while (minute >= 60) {
            hour++;
            minute -= 60;
        }
        while (hour >= 24) {
            hour -= 24;
        }

        System.out.printf("%d %d", hour, minute);
    }
}
