package Backjoon.Silver.B7795;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(in.readLine());
        while (n-- > 0) {
            String[] line = in.readLine().split(" ");
            int sizeA = Integer.parseInt(line[0]);
            int sizeB = Integer.parseInt(line[1]);

            int[] a = new int[sizeA], b = new int[sizeB];

            line = in.readLine().split(" ");
            for (int i = 0; i < sizeA; i++)
                a[i] = Integer.parseInt(line[i]);

            line = in.readLine().split(" ");
            for (int i = 0; i < sizeB; i++)
                b[i] = Integer.parseInt(line[i]);

            Arrays.sort(a);
            Arrays.sort(b);

            int indexA = 0, indexB = 0, count = 0;
            while (indexA < a.length) {
                if (indexB < b.length && a[indexA] > b[indexB])
                    indexB++;
                else {
                    indexA++;
                    count += indexB;
                }
            }
            out.write(count + "\n");
        }

        out.flush();
    }
}
