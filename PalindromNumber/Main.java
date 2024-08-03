package Backjoon.PalindromNumber;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String num = in.nextLine();

        while (!num.equals("0")) {
            boolean isPal = true;
            char[] c = num.toCharArray();

            for (int i = 0; i < c.length / 2; i++)
                if (!(c[i] == c[c.length - i - 1]))
                    isPal = false;

            System.out.println(isPal ? "yes" : "no");
            num = in.nextLine();
        }
    }
}
