package Backjoon.recipt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int totalPrice = in.nextInt();
        int n = in.nextInt(); int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += in.nextInt() * in.nextInt();
        }
        String output = sum == totalPrice ? "Yes" : "No";
        System.out.println(output);
    }
}
