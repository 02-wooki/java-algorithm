package Backjoon.Bronze.Pitagoras;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            int[] len = new int[3];
            for (int i = 0; i < 3; i++)
                len[i] = in.nextInt();

            if (len[0] + len[1] + len[2] == 0)
                break;

            if (isTriangle(sort(len)))
                System.out.println("right");
            else
                System.out.println("wrong");
        }
    }

    public static boolean isTriangle(int[] a) {
        return a[0]*a[0] + a[1]*a[1] == a[2]*a[2];
    }

    public static int[] sort(int[] arr) {
        if (arr[0] > arr[1] && arr[0] > arr[2]) {
            int tmp = arr[0];
            arr[0] = arr[2];
            arr[2] = tmp;
        } else if (arr[1] > arr[0] && arr[1] > arr[2]) {
            int tmp = arr[1];
            arr[1] = arr[2];
            arr[2] = tmp;
        }

        return arr;
    }
}
