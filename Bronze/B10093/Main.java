package Backjoon.Bronze.B10093;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long start = in.nextLong();
        long end = in.nextLong();

        if (start > end) {
            long tmp = start;
            start = end;
            end = tmp;
        }

        long n = end - start - 1L;
        System.out.println(n < 0 ? 0 : n);
        while (++start < end)
            System.out.print(start + " ");
    }
}
