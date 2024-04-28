package Backjoon.transBaseReverse;

import java.util.Scanner;

import static java.lang.String.valueOf;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int origin = in.nextInt();
        int base = in.nextInt();
        String transed = "";

        while (origin != 0) {

            int weight = origin % base;

            if (base < 10)
                transed = weight + transed;
            else
                transed = (weight < 10 ? valueOf(weight) : valueOf((char)(weight - 10 + 'A'))) + transed;

            origin /= base;
        }

        System.out.println(transed);
    }
}
