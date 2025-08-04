package Backjoon.Silver.B4949;

import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        String line = in.readLine();
        while (!line.equals(".")) {
            Stack<Character> trace = new Stack<>();
            boolean isBalanced = true;

            for (char c : line.toCharArray()) {
                if (c == '(' || c == '[')
                    trace.push((c == '(') ? ')' : ']');
                else if (c == ')' || c == ']')
                    if (trace.empty() || trace.pop() != c) {
                        isBalanced = false;
                        break;
                    }
            }
            
            out.write(((isBalanced && trace.isEmpty()) ? "yes" : "no") + "\n");
            line = in.readLine();
        }

        out.flush();
    }
}
