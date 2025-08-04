package Backjoon.Silver.B11652;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(in.readLine());
        List<Long> list = new ArrayList<>();
        for (int i = 0; i < n; i++)
            list.add(Long.parseLong(in.readLine()));

        Collections.sort(list);

        long freq = 0, maxFreq = 0, maxFreqValue = list.get(0), prev = list.get(0);
        for (long i: list) {
            if (i != prev) {
                if (freq > maxFreq) {
                    maxFreq = freq;
                    maxFreqValue = prev;
                }
                freq = 1;
                prev = i;
            } else
                freq++;
        }

        if (freq > maxFreq)
            maxFreqValue = prev;

        out.write(maxFreqValue + "\n");
        out.flush();
    }
}
