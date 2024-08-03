package Backjoon.Bronze.AsciiNumSum;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        char[] s = in.next().toCharArray();

        int sum = 0;

        for (char c : s)
            sum += (int)c - '0';

        System.out.println(sum);

    }
}
