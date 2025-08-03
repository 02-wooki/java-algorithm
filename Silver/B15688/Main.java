package Backjoon.Silver.B15688;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(in.readLine());
        int[] list = new int[n];
        while (n-- > 0)
            list[n] = Integer.parseInt(in.readLine());

        Arrays.sort(list);

        for (int i = 0; i < list.length; i++)
            out.write(list[i] + "\n");

        out.flush();
    }
}
