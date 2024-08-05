package Backjoon.Bronze.B28702;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;

        for (int i = 0; i < 3; i++) {
            String line = in.nextLine();

            if (line.charAt(0) <= '9' && line.charAt(0) >= '0') {
                num = Integer.parseInt(line) + 3 - i;
                break;
            }
        }

        if (num % 15 == 0)
            System.out.println("FizzBuzz");
        else if (num % 5 == 0)
            System.out.println("Buzz");
        else if (num % 3 == 0)
            System.out.println("Fizz");
        else
            System.out.println(num);
    }
}
