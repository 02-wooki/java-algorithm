package Backjoon.Silver.B1676;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(n / 5 + n / 25 + n / 125);
    }
}
