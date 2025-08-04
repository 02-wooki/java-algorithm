package Backjoon.Silver.B10799;

import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        String x = in.readLine();
        Stack<Character> stack = new Stack<>();

        int count = 0;
        char prev = ')';
        for (char c: x.toCharArray()) {
            if (c == '(')
                stack.push(c);
            else if (prev == c) {
                count++;
                stack.pop();
            } else {
                stack.pop();
                count += stack.size();
            }

            prev = c;
        }

        out.write(count + "\n");
        out.flush();
    }
}
