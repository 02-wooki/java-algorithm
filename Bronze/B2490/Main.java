package Backjoon.Bronze.B2490;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            int count = 0;
            for (int j = 0; j < 4; j++)
                count += in.nextInt();

            switch (count) {
                case 1:
                    System.out.println("C");
                    break;
                case 2:
                    System.out.println("B");
                    break;
                case 3:
                    System.out.println("A");
                    break;
                case 4:
                    System.out.println("E");
                    break;
                case 0:
                    System.out.println("D");
                    break;
            }
        }
    }
}
