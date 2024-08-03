package Backjoon.Bronze.B1157;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        char[] c = in.next().toCharArray();

        int[] alpha = new int[26];
        int max = 0;
        int maxidx = 0;
        int maxNum = 0;

        for (int i = 0; i < 26; i++)
            alpha[i] = 0;

        for (char x : c) {
            if (x >= 'A' && x <= 'Z')
                alpha[(int)(x - 'A')]++;
            else
                alpha[(int)(x - 'a')]++;
        }

        for (int i = 0; i < 26; i++) {
            if (alpha[i] > max)
                max = alpha[i];
        }

        for (int i = 0; i < 26; i++) {
            if (alpha[i] == max) {
                maxidx = i;
                maxNum++;
            }
        }

        if (maxNum == 1)
            System.out.println((char)(maxidx + 'A'));
        else
            System.out.println("?");

    }
}
