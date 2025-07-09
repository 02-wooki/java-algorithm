package Backjoon.Bronze.B10804;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] list =  new int[20];
        for (int i = 0; i < 20; i++)
            list[i] = i + 1;

        for (int i = 0; i < 10; i++) {
            int start = in.nextInt() - 1, end = in.nextInt() - 1;
            while (start < end) {
                int tmp = list[start];
                list[start++] = list[end];
                list[end--] = tmp;
            }
        }

        for(Integer i: list)
            System.out.print(i + " ");
    }
}
