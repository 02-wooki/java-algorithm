package Backjoon.Silver.B10866;

import java.io.*;

class Deque {
    final int MAX_CAPACITY = 20000;
    private int[] data;
    private int head;
    private int tail;

    public Deque() {
        data = new int[MAX_CAPACITY];
        head = 10000;
        tail = 10000;
    }

    public void pushFront(int value) {
        data[--head] = value;
    }

    public void pushBack(int value) {
        data[tail++] = value;
    }

    public int popFront() {
        return isEmpty() ? -1 : data[head++];
    }

    public int popBack() {
        return isEmpty() ? -1 : data[--tail];
    }

    public int size() {
        return tail - head;
    }

    public boolean isEmpty() {
        return head == tail;
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
        Deque q = new Deque();
        while (n-- > 0) {
            String cmd = in.readLine();
            if (cmd.startsWith("push_front"))
                q.pushFront(Integer.parseInt(cmd.split(" ")[1]));
            else if (cmd.startsWith("push_back"))
                q.pushBack(Integer.parseInt(cmd.split(" ")[1]));
            else if (cmd.startsWith("pop_front"))
                out.write(q.popFront() + "\n");
            else if (cmd.startsWith("pop_back"))
                out.write(q.popBack() + "\n");
            else if (cmd.startsWith("size"))
                out.write(q.size() + "\n");
            else if (cmd.startsWith("empty"))
                out.write(q.isEmpty() ? "1\n" : "0\n");
            else if (cmd.startsWith("front"))
                out.write(q.front() + "\n");
            else if (cmd.startsWith("back"))
                out.write(q.back() + "\n");
        }
        out.flush();
    }
}
