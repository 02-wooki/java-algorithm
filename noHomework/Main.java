package Backjoon.noHomework;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        boolean[] student = new boolean[31];

        for (int i = 0; i < student.length; i++)
            student[i] = false;

        student[0] = true;
        for (int i = 0; i < 28; i++)
            student[in.nextInt()] = true;

        for (int i = 0; i < student.length; i++)
            if (!student[i])
                System.out.println(i);
    }
}
