package Backjoon.Silver.B11931;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(in.readLine());
        int[] list = new int[n];
        while (n-- > 0)
            list[n] = Integer.parseInt(in.readLine());

        Arrays.sort(list);
        for (int i = list.length - 1; i >= 0 ; i--)
            out.write(list[i] + "\n");

        out.flush();
    }
}
