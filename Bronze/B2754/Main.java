package Backjoon.Bronze.B2754;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] c = in.nextLine().toCharArray();
        double s = switch (c[0]) {
            case 'A' -> 4.0;
            case 'B' -> 3.0;
            case 'C' -> 2.0;
            default -> 1.0;
        };

        if (c.length == 1)
            System.out.println("0.0");
        else if (c[1] == '0')
            System.out.printf("%.1f", s);
        else if (c[1] == '+')
            System.out.println(s + 0.3);
        else
            System.out.println(s - 0.3);
    }
}
