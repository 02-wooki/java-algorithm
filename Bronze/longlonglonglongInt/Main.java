package Backjoon.Bronze.longlonglonglongInt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String output = "";
        for (int i = 0; i < n; i += 4) {
            output += "long ";
        }
        System.out.println(output + "int");
    }
}
