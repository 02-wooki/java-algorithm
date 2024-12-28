package Backjoon.Silver.B1181;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());

        // 입력받을 개수만큼 입력받기
        Node root = new Node(in.nextLine());
        for (int i = 1; i < n; i++) {
            new Node(root, in.nextLine());

            // 루트 갱신
            while (root.prev != null)
                root = root.prev;
        }

        Node p = root;
        while (p != null) {
            System.out.println(p.data);
            p = p.next;
        }
    }
}

class Node {

    Node next;
    Node prev;
    String data;
    int length;

    public Node(String data) {
        this.next = null;
        this.prev = null;
        this.data = data;
        this.length = data.length();
    }
    public Node(Node root ,String data) {
        this(data);

        // 자리 찾기
        Node prev = null;
        Node p = root;
        while (p != null) {
            // 중복 데이터 입력받은 경우
            if (p.data.equals(data))
                return;     // 노드 추가하지 않고 리턴

            // 길이, 사전순서 비교
            if (p.length > this.length || (p.length == this.length && p.data.compareTo(data) > 0))
                break;
            else {
                prev = p;
                p = p.next;
            }
        }

        // 노드 연결
        if(p == null) {                 // 새 노드가 가장 마지막이 된 경우
            prev.next = this;
            this.prev = prev;
        } else if (p.prev == null) {    // 새 노드가 가장 앞자리(루트)가 된 경우
            p.prev = this;
            this.next = p;
        } else {                        // 새 노드가 중간인 경우
            this.next = p;
            this.prev = p.prev;
            p.prev.next = this;
            p.prev = this;
        }
    }
}