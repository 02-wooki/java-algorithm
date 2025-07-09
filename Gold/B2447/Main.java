package Backjoon.Gold.B2447;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static String printMiddle(boolean[] stars, int n, int x) {

        String result = "";

        if (x == 1) {
            for (boolean b: stars)
                result += b ? "*" : " ";
            result += "\n";
            return result;
        }

        result += printMiddle(stars, n, x / 3);

        boolean[] deepstars = Arrays.copyOf(stars, n);
        for (int i = 0; i <= n - x; i += x)
            for (int j = x / 3 + i; j < x * 2 / 3 + i; j++)
                deepstars[j] = false;
        result += printMiddle(deepstars, n, x / 3);

        result += printMiddle(stars, n, x / 3);

        return result;
    }

    public static String printStar(int n, int x) {

        String result = "";

        if (x == 3) {
            for (int i = 0; i < n; i++)
                result += "*";
            result += "\n";

            for (int i = 0; i < n; i++)
                result += i % 3 == 1 ? " " : "*";
            result += "\n";

            for (int i = 0; i < n; i++)
                result += "*";
            result += "\n";
            return result;
        }

        result += printStar(n, x / 3);

        boolean[] stars = new boolean[n];
        Arrays.fill(stars, true);
        for (int i = 0; i <= n - x; i += x)
            for (int j = x / 3 + i; j < x * 2 / 3 + i; j++)
                stars[j] = false;
        result += printMiddle(stars, n, x / 3);

        result += printStar(n, x / 3);

        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println(printStar(n, n));
    }
}
