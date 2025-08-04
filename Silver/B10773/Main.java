package Backjoon.Silver.B10773;

import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(in.readLine());
        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(in.readLine());
            if (x == 0)
                s.pop();
            else
                s.push(x);
        }

        int count = 0;
        while (!s.isEmpty())
            count += s.pop();

        out.write(count + "\n");
        out.flush();
    }
}
