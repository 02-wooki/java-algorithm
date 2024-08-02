package Backjoon.Scale;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String x = in.nextLine();

        if (x.equals("1 2 3 4 5 6 7 8"))
            System.out.println("ascending");
        else if (x.equals("8 7 6 5 4 3 2 1"))
            System.out.println("descending");
        else
            System.out.println("mixed");
    }
}
