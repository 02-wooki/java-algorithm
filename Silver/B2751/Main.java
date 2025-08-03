package Backjoon.Silver.B2751;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());

        int[] list = new int[n];
        for (int i = 0; i < n; i++)
            list[i] = Integer.parseInt(in.readLine());

        Arrays.sort(list);

        for (int i: list)
            System.out.println(i);
    }
}
