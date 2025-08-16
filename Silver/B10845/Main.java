package Backjoon.Silver.B10845;

import java.io.*;

class Queue {
    final int MAX_CAPACITY = 10000;

    private int[] data;
    private int head;
    private int tail;

    public Queue() {
        data = new int[MAX_CAPACITY];
        head = 0;
        tail = 0;
    }

    public void push(int x) {
        data[tail++] = x;
    }

    public int pop() {
        return isEmpty() ? -1 : data[head++];
    }

    public boolean isEmpty() {
        return head == tail;
    }

    public int size() {
        return tail - head;
    }

    public int front() {
        return isEmpty() ? -1 : data[head];
    }

    public int back() {
        return isEmpty() ? -1 : data[tail - 1];
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(in.readLine());
        Queue q = new Queue();

        while (n-- > 0) {
            String cmd = in.readLine();
            if (cmd.startsWith("push"))
                q.push(Integer.parseInt(cmd.split(" ")[1]));
            else if (cmd.equals("pop"))
                out.write(q.pop() + "\n");
            else if (cmd.equals("size"))
                out.write(q.size() + "\n");
            else if (cmd.equals("empty"))
                out.write(q.isEmpty() ? "1\n" : "0\n");
            else if (cmd.equals("front"))
                out.write(q.front() + "\n");
            else
                out.write(q.back() + "\n");
        }

        out.flush();
    }
}
