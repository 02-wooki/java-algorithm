package Backjoon.Silver.B9012;

import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(in.readLine());
        for (int i = 0; i < n; i++) {
            String s = in.readLine();
            Stack<Character> stack = new Stack<>();

            boolean isVfs = true;
            for (char c: s.toCharArray()) {
                if (c == '(')
                    stack.push(c);
                else if (!stack.isEmpty())
                    stack.pop();
                else {
                    isVfs = false;
                    break;
                }
            }
            
            out.write((isVfs && stack.empty() ? "YES" : "NO") + "\n");
        }
        out.flush();
    }
}
