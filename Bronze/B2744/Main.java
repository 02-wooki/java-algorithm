package Backjoon.Bronze.B2744;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] c = in.nextLine().toCharArray();

        for (int i = 0; i < c.length; i++)
            c[i] = (char) (c[i] ^ 32);

        System.out.println(String.valueOf(c));
    }
}
