package Backjoon.Gold.B5430;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(in.readLine());
        while (t-- > 0) {
            Deque<Integer> deque = new ArrayDeque<>();
            boolean reversed = false, isError = false;
            char[] commands = in.readLine().toCharArray();

            int arraySize = Integer.parseInt(in.readLine());
            String[] initArray = in.readLine().replace('[', ' ').replace(']', ' ').trim().split(",");
            for (String s: initArray)
                if (!s.isEmpty())
                    deque.addLast(Integer.parseInt(s));

            for (char cmd: commands) {
                if (cmd == 'R')
                    reversed = !reversed;
                else {
                    if (deque.isEmpty()) {
                        out.write("error\n");
                        isError = true;
                        break;
                    }

                    if (reversed)
                        deque.pollLast();
                    else
                        deque.pollFirst();
                }
            }

            if (isError)
                continue;

            StringBuilder res = new StringBuilder();
            res.append("[");
            while (!deque.isEmpty()) {
                if (reversed)
                    res.append(deque.pollLast());
                else
                    res.append(deque.pollFirst());
                res.append(",");
            }
            if (res.charAt(res.length() - 1) == ',')
                res.deleteCharAt(res.length() - 1);
            res.append("]\n");
            out.write(res.toString());
        }

        out.flush();
    }
}
