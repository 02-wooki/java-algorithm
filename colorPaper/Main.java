package Backjoon.colorPaper;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int area = 0;

        boolean[][] canv = new boolean[100][100];

        for (int i = 0; i < n; i++)
            painting(canv, in.nextInt(), in.nextInt());

        for (boolean[] bo : canv)
            for (boolean b : bo)
                if (b) area++;

        System.out.println(area);
    }

    static void painting(boolean[][] canv, int x, int y) {
        for (int i = 0; i < 10; i++)
            for (int j = 0; j < 10; j++)
                canv[y + i][x + j] = true;
    }
}
