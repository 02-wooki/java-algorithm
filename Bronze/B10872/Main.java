package Backjoon.Bronze.B10872;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(p(in.nextInt()));
    }

    public static int p(int n) {
        if (n == 0)
            return 1;
        else
            return n * p(n-1);
    }
}
