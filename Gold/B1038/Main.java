package Backjoon.Gold.B1038;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        long i = -1, count = -1;
        while (count < n && i++ != Long.MIN_VALUE) {
            String s = Long.toString(i);
            boolean isDescending = true;
            for (int j = 0; j < s.length() - 1; j++)
                if (s.charAt(j) <= s.charAt(j + 1)) {
                    isDescending = false;

                    char[] c = s.toCharArray();
                    for (int k = j + 1; k < s.length(); k++)
                        c[k] = '9';

                    try {
                        i = Long.parseLong(String.copyValueOf(c));
                    } catch (NumberFormatException e) {
                        System.out.println(-1);
                        return;
                    }

                    break;
                }

            if (isDescending && count++ == n)
                break;
        }
        System.out.println(i);
    }
}
