package Backjoon.Silver.B2839;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int five = n / 5;
        int three = 0;
        while (five * 5 + three * 3 != n) {
            while (three * 3 + five * 5 < n)
                three++;
            if (three * 3 + five * 5 == n)
                break;
            if (--five < 0)
                break;
        }

        if (five < 0)
            System.out.println(-1);
        else
            System.out.println(five + three);
    }
}
