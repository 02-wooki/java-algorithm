package Backjoon.Bronze.B2675;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            int rep = in.nextInt();
            char[] s = in.next().toCharArray();

            for (char c : s) {
                for (int j = 0; j < rep; j++) {
                    System.out.print(c);
                }
            }

            System.out.println();
        }

    }
}
