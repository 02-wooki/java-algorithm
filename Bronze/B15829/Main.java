package Backjoon.Bronze.B15829;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();   in.nextLine();

        char[] c = in.nextLine().toCharArray();
        int[] nums = new int[c.length];

        for (int i = 0; i < c.length; i++)
            nums[i] = c[i] - 'a' + 1;

        long hashed = 0, powered = 1;
        for (int i = 0; i < nums.length; i++) {
            hashed = (hashed + nums[i] * powered) % 1234567891;
            powered = (powered * 31) % 1234567891;
        }

        System.out.println(hashed);
    }
}
