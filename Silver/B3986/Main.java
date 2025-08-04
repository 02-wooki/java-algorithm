package Backjoon.Silver.B3986;

import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(in.readLine());
        int count = 0;
        for (int i = 0; i < n; i++) {
            String s = in.readLine();
            Stack<Character> stack = new Stack<>();
            count++;

            for (char c: s.toCharArray()) {
                if (!stack.empty() && stack.peek() == c)
                    stack.pop();
                else
                    stack.push(c);
            }

            if (!stack.empty())
                count--;
        }

        out.write(count + "\n");
        out.flush();
    }
}
