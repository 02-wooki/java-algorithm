package Backjoon.arrCount;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 0;
        int v;
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++)
            arr[i] = in.nextInt();

        v = in.nextInt();

        for (int i = 0; i < arr.length; i++)
            if(arr[i] == v)
                count++;

        System.out.println(count);

    }
}
