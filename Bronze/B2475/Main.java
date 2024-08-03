package Backjoon.Bronze.B2475;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = 0;
        while (in.hasNextInt()) {
            int next = in.nextInt();
            x += next * next;
        }

        System.out.println(x % 10);
    }
}
