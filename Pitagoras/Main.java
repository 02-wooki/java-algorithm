package Backjoon.Pitagoras;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();
        if (a * a + b * b == c * c)
            System.out.println("right");
        else
            System.out.println("wrong");
    }
}
