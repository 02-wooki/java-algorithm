package Backjoon.YourGrade;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int totalTime = 0;
        double sum = 0.0;

        Scanner in = new Scanner(System.in);

        while (in.hasNextLine()) {
            Scanner lin = new Scanner(in.nextLine());
            lin.next();
            double time = lin.nextDouble();
            totalTime += time;
            String grade = lin.next();
            switch (grade) {
                case "A+":
                    sum += 4.5 * time;
                    break;
                case "A0":
                    sum += 4.0 * time;
                    break;
                case "B+":
                    sum += 3.5 * time;
                    break;
                case "B0":
                    sum += 3.0 * time;
                    break;
                case "C+":
                    sum += 2.5 * time;
                    break;
                case "C0":
                    sum += 2.0 * time;
                    break;
                case "D+":
                    sum += 1.5 * time;
                    break;
                case "D0":
                    sum += 1.0 * time;
                    break;
                case "P":
                    totalTime -= time;
                    break;
            }
        }

        System.out.println(sum / totalTime);
    }
}
