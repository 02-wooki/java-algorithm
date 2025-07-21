package Backjoon.Silver.B2004;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), r = in.nextInt();
        int resTwo = 0, resFive = 0;

        // n!에 있는 2, 5의 개수
        int i = n;
        while (i > 1) {
            resTwo += i / 2;
            i /= 2;
        }
        i = n;
        while (i > 1) {
            resFive += i / 5;
            i /= 5;
        }

        // (n-r)!에 있는 2, 5의 개수
        i = n - r;
        while (i > 1) {
            resTwo -= i / 2;
            i /= 2;
        }
        i = n - r;
        while (i > 1) {
            resFive -= i / 5;
            i /= 5;
        }

        // r!에 있는 2, 5의 개수
        i = r;
        while (i > 1) {
            resTwo -= i / 2;
            i /= 2;
        }
        i = r;
        while (i > 1) {
            resFive -= i / 5;
            i /= 5;
        }

        System.out.println(Math.min(resTwo, resFive));
    }
}