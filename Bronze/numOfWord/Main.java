package Backjoon.Bronze.numOfWord;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int counter = 0;

        while (in.hasNext()) {
            in.next();
            counter++;
        }

        System.out.println(counter);
    }
}
