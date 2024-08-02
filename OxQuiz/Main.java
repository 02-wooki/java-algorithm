package Backjoon.OxQuiz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        in.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println(score(in.nextLine()));
        }
    }

    public static int score(String originString) {
        char[] ox = originString.toCharArray();
        int strik = 0;
        int s = 0;

        for (char c : ox) {
            if (c == 'O')
                s += ++strik;
            else
                strik = 0;
        }

        return s;
    }
}
