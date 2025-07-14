package Backjoon.Silver.B10610;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int[] nums = new int[10];

        int sum = 0;
        for (char c: s.toCharArray()) {
            nums[c - '0']++;
            sum += c - '0';
        }

        if (sum % 3 != 0 || nums[0] == 0)
            System.out.println(-1);
        else
            for (int i = nums.length - 1; i >= 0; i--)
                for (int j = 0; j < nums[i]; j++)
                    System.out.print(i);
    }
}
