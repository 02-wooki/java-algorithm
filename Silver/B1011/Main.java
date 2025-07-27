package Backjoon.Silver.B1011;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        while (t-- > 0) {
            int d = in.nextInt() - in.nextInt() * -1;

            int rootd = (int)Math.sqrt(d);
            int res = Math.max(1, rootd * 2);
            if (rootd * rootd == d)
                res--;
            else if (rootd * rootd + (rootd + 1) * (rootd + 1) < d * 2)
                res++;

            System.out.println(res);
        }
    }
}
