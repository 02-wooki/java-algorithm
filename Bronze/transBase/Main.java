package Backjoon.Bronze.transBase;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String s = in.next();
        int base = in.nextInt();
        int[] origin = strToInt(s);
        int ten = 0, weight = 1;

        for (int i = origin.length - 1; i >= 0; i--) {
            ten += weight * origin[i];
            weight *= base;
        }

        System.out.println(ten);
    }

    static int[] strToInt(String s) {
        int[] i = new int[s.length()];

        for (int j = 0; j < s.length(); j++) {
            char c = s.charAt(j);
            if (c >= '0' && c <= '9')
                i[j] = c - '0';
            else
                i[j] = 10 + (c - 'A');
        }

        return i;
    }
}
