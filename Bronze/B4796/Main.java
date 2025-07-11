package Backjoon.Bronze.B4796;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int l = in.nextInt(), p = in.nextInt(), v = in.nextInt();
        int i = 1;

        while (l + p + v != 0) {

            int c = (v / p) * l + Math.min(v % p, l);
            System.out.println("Case " + i++ + ": " + c);

            l = in.nextInt();
            p = in.nextInt();
            v = in.nextInt();
        }
    }
}
