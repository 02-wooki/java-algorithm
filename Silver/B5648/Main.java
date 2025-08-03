package Backjoon.Silver.B5648;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = in.nextInt();
        long[] list =  new long[n];
        while (n-- > 0) {
            char[] x = String.valueOf(in.nextLong()).toCharArray();

            StringBuilder builder = new StringBuilder();
            for (int i = x.length - 1; i >= 0; i--)
                builder.append(x[i]);

            list[n] = Long.parseLong(builder.toString());
        }

        Arrays.sort(list);

        for (long i: list)
            out.write(i + "\n");

        out.flush();
    }
}
