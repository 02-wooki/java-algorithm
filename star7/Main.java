package Backjoon.star7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println(stars(n, i));
        }
        for (int i = n - 2; i >= 0 ; i--) {
            System.out.println(stars(n, i));
        }
    }

    public static String stars(int n, int i) {
        
        String out = "";
        for (int j = 0; j < n - i - 1; j++) {
            out += " ";
        }
        for (int j = 0; j < 2 * i + 1; j++) {
            out += "*";
        }

        return out;
    }
}
