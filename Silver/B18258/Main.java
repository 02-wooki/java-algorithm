package Backjoon.Silver.B18258;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(in.readLine());
        Deque<Integer> q = new ArrayDeque<>();
        while (n-- > 0) {
            String cmd = in.readLine();
            if (cmd.startsWith("push"))
                q.add(Integer.parseInt(cmd.split(" ")[1]));
            else if (cmd.startsWith("pop"))
                out.write((q.isEmpty() ? -1 : q.poll()) + "\n");
            else if (cmd.startsWith("size"))
                out.write(q.size() + "\n");
            else if (cmd.startsWith("empty"))
                out.write((q.isEmpty() ? 1 : 0) + "\n");
            else if (cmd.startsWith("front"))
                out.write((q.isEmpty() ? -1 : q.getFirst()) + "\n");
            else if (cmd.startsWith("back"))
                out.write((q.isEmpty() ? -1 : q.getLast()) + "\n");
        }

        out.flush();
    }
}
