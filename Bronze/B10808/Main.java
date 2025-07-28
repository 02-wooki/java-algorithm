package Backjoon.Bronze.B10808;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        int[] table =  new int[26];
        for (char c:  s.toCharArray())
            table[c - 'a']++;

        for (int i: table)
            System.out.print(i + " ");
    }
}
