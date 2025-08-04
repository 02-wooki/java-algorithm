package Backjoon.Silver.B10828;

import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(in.readLine());
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            String[] line =  in.readLine().split(" ");

            if (line[0].equals("push"))
                stack.push(Integer.parseInt(line[1]));
            else if (line[0].equals("pop"))
                    out.write((stack.isEmpty() ? -1 : stack.pop()) + "\n");
            else if (line[0].equals("size"))
                out.write(stack.size() + "\n");
            else if (line[0].equals("empty"))
                out.write((stack.empty() ? 1 : 0) + "\n");
            else if (line[0].equals("top"))
                out.write((stack.isEmpty() ? -1 : stack.peek()) + "\n");
        }

        out.flush();
    }
}
