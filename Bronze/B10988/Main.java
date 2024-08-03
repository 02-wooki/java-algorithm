package Backjoon.Bronze.B10988;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        char[] c = in.next().toCharArray();
        boolean isPalindrome = true;

        for (int i = 0; i < c.length / 2; i++) {
            if (c[i] != c[c.length - 1 - i])
                isPalindrome = false;
        }

        System.out.println(isPalindrome ? 1 : 0);
    }
}
