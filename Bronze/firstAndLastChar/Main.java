package Backjoon.Bronze.firstAndLastChar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {

            String s = in.next();
            System.out.printf("%c%c\n", s.charAt(0), s.charAt(s.length() - 1));

        }

    }
}
