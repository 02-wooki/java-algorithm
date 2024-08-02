package Backjoon.AddingTrouble;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        if (in.nextInt() + in.nextInt() == in.nextInt())
            System.out.println("correct!");
        else
            System.out.println("wrong!");
    }
}
