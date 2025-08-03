package Backjoon.Silver.B1158;

import java.util.Scanner;

class Node {
    int data;
    Node next;

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}

class RoundedLinkedList {
    Node curs;
    int size;

    public RoundedLinkedList(int capacity) {
        size = capacity;
        curs = new Node(1, null);
        Node p = curs;
        for (int i = 2; i <= capacity; i++, curs = curs.next)
            if (i == 2)
                p.next = curs.next = new Node(i, p);
            else
                curs.next = new Node(i, p);
    }

    public int moveAndDelete(int times) {
        if (size-- <= 0)
            return -1;

        if (size == 0)
            return curs.data;

        while (times-- > 1)
            curs = curs.next;

        Node p = curs.next;
        curs.next = p.next;
        return p.data;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), k = in.nextInt();

        RoundedLinkedList l = new RoundedLinkedList(n);
        StringBuilder s = new StringBuilder("<");

        while (l.size > 0) {
            s.append(l.moveAndDelete(k));
            s.append(", ");
        }

        System.out.println(s.substring(0, s.length() - 2) + ">");
    }
}
