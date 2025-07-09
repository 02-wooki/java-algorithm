package Backjoon.Bronze.B1267;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();
        int n = in.nextInt();
        for (int i = 0; i < n; i++)
            list.add(in.nextInt());

        int y = 0, m = 0;
        for(Integer i: list) {
            y += (i / 30) * 10 + 10;
            m += (i / 60) * 15 + 15;
        }

        if (y <= m)
            System.out.print("Y ");
        if (m <= y)
            System.out.print("M ");
        System.out.println(m <= y ? m : y);
    }
}
