package Backjoon.Silver.B1057;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int kim = in.nextInt(), lim =  in.nextInt();

        int i = 1;
        while ((kim + 1) / 2 != (lim + 1) / 2) {
            kim = (kim + 1) / 2;
            lim = (lim + 1) / 2;
            i++;
        }

        System.out.println(i);
    }
}
