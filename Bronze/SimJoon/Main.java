package Backjoon.Bronze.SimJoon;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println(grade(in.nextInt(), in.nextInt()));
        }
    }

    public static double calcBmi(int height, int weight) {
        double meterHeight = (double)height / 100;
        return (double)weight / (meterHeight * meterHeight);
    }

    public static int grade(int height, int weight) {

        double bmi = calcBmi(height, weight);

        int g = 0;

        if (bmi < 16 || bmi >= 35)
            g = 4;
        else if (bmi < 18.5 || bmi >= 30)
            g = 3;
        else if (bmi < 20 || bmi >= 25)
            g = 2;
        else
            g = 1;

        if (height <= 140)
            g = 6;
        else if (height < 146)
            g = 5;
        else if (height < 159 || height >= 204)
            g = 4;
        else if (height < 161 && (bmi >= 16 && bmi < 35))
            g = 3;

        return g;
    }
}
