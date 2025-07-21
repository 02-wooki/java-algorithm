package Backjoon.Bronze.B1292;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt();

        List<Integer> list = new ArrayList<>();
        for (int i = 1; list.size() <= 1000; i++)
            for (int j = 0; j < i; j++)
                list.add(i);

        int sum = 0;
        for (int i = a; i <= b; i++)
            sum += list.get(i - 1);

        System.out.println(sum);
    }
}
