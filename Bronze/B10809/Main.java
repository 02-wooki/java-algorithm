package Backjoon.Bronze.B10809;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String s = in.next();

        int[] alphaIdx = new int[26];

        for (int i = 0; i < alphaIdx.length; i++)
            alphaIdx[i] = -1;

        for (int i = s.length() - 1; i >= 0; i--)
            alphaIdx[(int)(s.charAt(i) - 'a')] = i;

        for (int i: alphaIdx)
            System.out.printf("%d ", i);


    }
}
