package Backjoon.Silver.B3273;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] list =  new int[in.nextInt()];
        for (int i = 0; i < list.length; i++)
            list[i] = in.nextInt();

        int x = in.nextInt(), count = 0;

        Arrays.sort(list);
        int i = 0, j = list.length - 1;
        while (i < j) {
            if (list[i] + list[j] < x)
                i++;
            else if (list[i] + list[j] > x)
                j--;
            else {
                i++;
                j--;
                count++;
            }
        }

        System.out.println(count);
    }
}
