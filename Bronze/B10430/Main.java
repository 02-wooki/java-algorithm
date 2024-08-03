package Backjoon.Bronze.B10430;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean[] rem = new boolean[42];
        int count = 0;

        for (int i = 0; i < rem.length; i++)
            rem[i] = false;

        for (int i = 0; i < 10; i++)
            rem[in.nextInt() % 42] = true;

        for (boolean b : rem) {
            if (b)
                count++;
        }

        System.out.println(count);
    }
}
