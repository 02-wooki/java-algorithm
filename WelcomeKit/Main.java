package Backjoon.WelcomeKit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] size = new int[6];

        for (int i = 0; i < size.length; i++)
            size[i] = in.nextInt();

        int t = in.nextInt(), p = in.nextInt();

        int shirtOrder = 0;
        for (int i : size)
            while (i > 0) {
                i -= t;
                shirtOrder++;
            }

        System.out.println(shirtOrder);
        System.out.println(n / p + " " + n % p);

    }
}
