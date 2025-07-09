package Backjoon.Bronze.B2752;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> n = new ArrayList<>();
        for (int i = 0; i < 3; i++)
            n.add(in.nextInt());

        Collections.sort(n);
        for (Integer i: n)
            System.out.print(i + " ");
    }
}
