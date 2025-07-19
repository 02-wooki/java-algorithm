package Backjoon.Gold.B10993;

import java.util.Scanner;

public class Main {

    static boolean[][] stars;

    static void booleanStars(int n, int x, int y) {
        if (n == 2) {
            for (int i = 0; i < 3; i++)
                for (int j = i; j < 5 - i; j++)
                    stars[y + i][x + j] = true;
            return;
        }

        int height = (int) Math.pow(2.0, n) - 1;
        int width = height * 2 - 1;

        if (n % 2 == 0) {
            for (int i = 0; i < height; i++) {
                stars[y][x + i] = true;
                stars[y][x + width - 1 - i] = true;
                stars[y + i][x + i] = true;
                stars[y + i][x + width - 1 - i] = true;
            }
            booleanStars(n - 1, x + height / 2 + 1, y + 1);
        } else if (n % 2 == 1) {
            for (int i = 0; i < height; i++) {
                stars[y + height - 1][x + i] = true;
                stars[y + height - 1][x + width - 1 - i] = true;
                stars[y + height - 1 - i][x + i] = true;
                stars[y + i][x + height + i - 1] = true;
            }
            booleanStars(n - 1, x + height / 2 + 1, y + height / 2);
        }
    }

    public static void main(String[] args) {
        StringBuilder s = new StringBuilder();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if (n == 1) {
            System.out.println("*");
            return;
        }

        int height = (int)Math.pow(2.0, n) - 1;
        int width = height * 2 - 1;

        stars = new boolean[height][width];
        booleanStars(n, 0, 0);

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < (n % 2 == 0 ? width - i : height + i); j++)
                s.append(stars[i][j] ? "*" : " ");
            s.append("\n");
        }

        System.out.println(s.toString());
    }
}
