package Backjoon.Silver.B1874;

import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(in.readLine());
        Stack<Integer> stack = new Stack<>();
        StringBuilder s = new StringBuilder();
        int maxValue = 1;

        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(in.readLine());
            while (maxValue <= x) {
                s.append("+\n");
                stack.push(maxValue++);
            }
            int res = stack.pop();
            s.append("-\n");

            if (res != x) {
                out.write("NO");
                out.flush();
                return;
            }
        }

        out.write(s.toString());
        out.flush();
    }
}
