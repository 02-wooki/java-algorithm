package Backjoon.Silver.B2089;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        StringBuilder res =  new StringBuilder();

        if (n == 0)
            res.append("0");

        while (n != 0) {
            res.insert(0, Math.abs(n % -2));
            n = (n % -2 < 0) ? n / -2 + 1 : n / -2;
        }

        System.out.println(res.toString());
    }
}