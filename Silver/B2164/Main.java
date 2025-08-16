package Backjoon.Silver.B2164;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= x; i++)
            q.add(i);

        while (q.size() > 1) {
            q.poll();
            q.add(q.poll());
        }

        System.out.println(q.poll());
    }
}
