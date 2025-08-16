package Backjoon.Gold.B6198;

import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int t =  Integer.parseInt(in.readLine());
        Stack<Long> towers = new Stack<>();
        long res = 0L;

        for (int i = 0; i < t; i++) {
            long height = Long.parseLong(in.readLine());

            while (!towers.isEmpty() && height >= towers.peek())
                towers.pop();

            res += towers.size();
            towers.push(height);
        }

        out.write(String.valueOf(res));
        out.flush();
    }
}
