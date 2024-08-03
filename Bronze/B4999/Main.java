package Backjoon.Bronze.B4999;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        if (in.nextLine().length() < in.nextLine().length())
            System.out.println("no");
        else
            System.out.println("go");
    }
}
