package Backjoon.Silver.Croatia;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String s = in.next();

        int count = s.length();

        for (int i = 2; i < s.length(); i++) {
            String tmp = s.substring(i - 2, i + 1);
            if (tmp.equals("dz="))
                count--;
        }
        for (int i = 1; i < s.length(); i++) {
            String tmp = s.substring(i - 1, i + 1);
            switch (tmp) {
                case "c=":
                case "c-":
                case "d-":
                case "lj":
                case "nj":
                case "s=":
                case "z=":
                    count--;
                    break;
            }
        }

        System.out.println(count);
    }
}
