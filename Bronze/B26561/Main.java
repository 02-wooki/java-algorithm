package Backjoon.Bronze.B26561;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            int beg = in.nextInt(), time = in.nextInt();
            System.out.println(beg - (time / 7) + (time / 4));
        }
    }
}
