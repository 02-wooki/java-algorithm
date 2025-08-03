package Backjoon.Silver.B5397;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Node {
    char data;
    Node next, prev;

    public Node(char s) {
        this(s, null, null);
    }

    public Node(char s, Node prev, Node next) {
        this.data = s;
        this.next = next;
        this.prev = prev;
    }
}

class LinkedList {
    Node head, tail, curs;
    int size;

    public LinkedList() {
        head = tail = curs = null;
        size = 0;
    }

    public void write(char c) {
        if (size == 0) {                        // 빈 문자열일 때
            Node p = new Node(c);
            head = tail = p;
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
        if (size == 0 || (curs != null && curs.prev == null))       // 빈 문자열이거나 커서가 앞 끝에 있을 때
            return;

        if (size == 1) {
            head = tail = curs = null;
            size = 0;
            return;
        }

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

        size--;
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
        int n = Integer.parseInt(in.readLine());

        while (n-- > 0) {
            char[] line = in.readLine().toCharArray();
            LinkedList s = new LinkedList();

            for (char c: line) {
                switch (c) {
                    case '<':   s.left();
                    break;
                    case '>':   s.right();
                    break;
                    case '-':   s.delete();
                    break;
                    default:    s.write(c);
                }
            }

            System.out.println(s);
        }
    }
}
