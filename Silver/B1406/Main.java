package Backjoon.Silver.B1406;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Node {
    char data;
    Node next;
    Node prev;

    public Node(char s) {
        this(s, null, null);
    }

    public Node(char s, Node prev, Node next) {
        this.data = s;
        this.next = next;
        this.prev = prev;
    }

    public boolean hasNext() {
        return next != null;
    }
}

class LinkedList {
    Node head;
    Node tail;
    Node curs;
    int size;

    public LinkedList() {
        head = tail = curs = null;
        size = 0;
    }

    public LinkedList(String s) {
        size = s.length();
        head = new Node(s.charAt(0));
        Node prev = head;
        for (int i = 1; i < s.length(); i++, prev = prev.next) {
            Node p = new Node(s.charAt(i), prev, null);
            prev.next = p;
        }
        tail = prev;
    }

    public void write(char c) {
        if (size == 0) {                        // 빈 문자열일 때
            Node p = new Node(c);
            head = tail = curs.prev = p;
        } else if (curs == null) {              // 커서가 뒤 끝에 있을 떄
            Node p = new Node(c, tail, null);
            tail.next = p;
            tail = p;
        } else {
            Node p = new Node(c, curs.prev, curs);
            if (curs.prev != null)              // 커서가 중간에 있을 떄
                curs.prev.next = p;
            else                                // 커서가 앞 끝에 있을 때
                head = p;
            curs.prev = p;
        }
        size++;
    }

    public void delete() {
        if (size == 0 || (curs != null && curs.prev == null))  // 빈 문자열이거나 커서가 앞 끝에 있을 때
            return;

        if (curs == null) {                                         // 커서가 뒤 끝에 있을 떄
            tail = tail.prev;
            tail.next = null;
        } else {                                                    // 커서가 중간에 있을 때
            if (curs.prev.prev != null)
                curs.prev.prev.next = curs;
            else                                                    // 커서 앞에 한 개의 글자만 있을 때
                head = curs;
            curs.prev = curs.prev.prev;
        }
    }

    public void left() {
        if (size == 0 || (curs != null && curs.prev == null))
            return;
        if (curs == null)
            curs = tail;
        else
            curs = curs.prev;
    }

    public void right() {
        if (size == 0 || curs == null)
            return;

        curs = curs.next;
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        for (Node p = head; p != null; p = p.next)
            s.append(p.data);
        return s.toString();
    }
}


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String init = in.readLine();
        int n =  Integer.parseInt(in.readLine());

        LinkedList s = new LinkedList(init);
        while (n-- > 0) {
            char[] cmd = in.readLine().toCharArray();
            switch (cmd[0]) {
                case 'L':   s.left();
                break;
                case 'D':   s.right();
                break;
                case 'B':   s.delete();
                break;
                case 'P':   s.write(cmd[2]);
            }
        }

        System.out.println(s);
    }
}
