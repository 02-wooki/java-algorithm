package Backjoon.Silver.B2448;

import java.io.*;

public class Main {

    static boolean[][] stars;

    static void printTriangle(int n, int x, int y) {
        if (n == 3) {
            stars[y][x + 2] = true;
            stars[++y][x + 1] = true;
            stars[y][x + 3] = true;
            y++;
            for (int i = 0; i < 5; i++)
                stars[y][x + i] = true;
            return;
        }

        printTriangle(n / 2, x + n / 2, y);
        printTriangle(n / 2, x, y + n / 2);
        printTriangle(n / 2, x + n, y + n / 2);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder res = new StringBuilder();

        int n = Integer.parseInt(in.readLine());
        stars = new boolean[n][n * 2];

        printTriangle(n, 0, 0);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2 * n; j++)
                res.append(stars[i][j] ? "*" : " ");
            res.append("\n");
        }
        out.write(res.toString());

        in.close();
        out.close();
    }
}
