package Backjoon.Bronze.B11328;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        while (n-- > 0) {
            String origin = in.next(), fried = in.next();
            int[] table =  new int[26];

            for (char c: origin.toCharArray())
                table[c - 'a']++;
            for (char c: fried.toCharArray())
                table[c - 'a']--;

            boolean isPossible = true;
            for (int i: table)
                if (i != 0) {
                    isPossible = false;
                    break;
                }

            System.out.println(isPossible? "Possible" : "Impossible");
        }
    }
}
