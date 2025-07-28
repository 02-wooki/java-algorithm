package Backjoon.Bronze.B1919;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String x = in.nextLine(), y =  in.nextLine();

        int[] table = new int[26];

        for (char c: x.toCharArray())
            table[c - 'a']++;
        for (char c: y.toCharArray())
            table[c - 'a']--;

        int count = 0;
        for (int i: table)
            count += Math.abs(i);

        System.out.println(count);
    }
}
