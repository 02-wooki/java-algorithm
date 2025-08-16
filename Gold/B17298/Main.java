package Backjoon.Gold.B17298;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] nge = new int[Integer.parseInt(in.readLine())];
        Stack<Integer> stack = new Stack<>();

        StringTokenizer st = new StringTokenizer(in.readLine());
        for (int i = 0; i < nge.length; i++) {
            nge[i] = Integer.parseInt(st.nextToken());

            while (!stack.isEmpty() && nge[stack.peek()] < nge[i])
                nge[stack.pop()] = nge[i];

            stack.push(i);
        }

        while (!stack.isEmpty())
            nge[stack.pop()] = -1;

        for (int i: nge)
            out.write(i + " ");
        out.flush();
    }
}
