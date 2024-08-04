package Backjoon.Bronze.B2869;

import java.util.Scanner;

// 첫날: up 만큼 도달, 두번째 날부터 하루에: up - down
// 두번째 날 이후: (up - down) * (day - 1)
// 따라서 distance = up + ((up - down) * (day - 1))
// distance - up = (up - down) * (day - 1)
// (distance - up) / (up - down) + 1 = day

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int up = in.nextInt(), down = in.nextInt(), goal = in.nextInt();
        System.out.println((int) (Math.ceil((double) (goal - up) / (up - down)) + 1));
    }
}
