package Backjoon.Bronze.B4101;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            int a = in.nextInt(), b = in.nextInt();

            if (a == 0 && b == 0)
                break;

            System.out.println(a > b ? "Yes" : "No");
        }
    }
}
