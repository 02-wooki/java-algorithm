package Backjoon.Bronze.add5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt();
        while (a != 0 & b != 0) {

            System.out.println(a+b);

            a = in.nextInt();
            b = in.nextInt();
        }
    }
}
