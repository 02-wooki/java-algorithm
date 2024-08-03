package Backjoon.Bronze.dial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        char[] s = in.next().toCharArray();

        int time = 0;

        for (char c : s) {
            switch (c) {
                case 'S':
                case 'V':
                case 'Y':
                case 'Z':
                    time -= 1;
                default:
                    time += (int)((c - 'A') / 3) + 2 + 1;
            }

        }

        System.out.println(time);
    }
}
