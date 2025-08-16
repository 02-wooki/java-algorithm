package Backjoon.Gold.B2493;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(in.readLine());
        StringTokenizer st = new StringTokenizer(in.readLine());

        int[] heights = new int[t];
        Stack<Integer> towers = new Stack<>();
        for (int i = 0; i < t; i++) {
            heights[i] = Integer.parseInt(st.nextToken());

            while (!towers.isEmpty() && heights[i] > heights[towers.peek()])
                towers.pop();

            if (towers.isEmpty())
                out.write("0 ");
            else
                out.write((towers.peek() + 1) + " ");

            towers.push(i);
        }

        out.flush();
    }
}