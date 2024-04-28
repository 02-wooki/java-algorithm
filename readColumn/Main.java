package Backjoon.readColumn;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String[] arr = arrInit(in);

        prtReadCol(arr);
    }

    static String[] arrInit(Scanner in) {
        String[] arr = new String[0];

        while (in.hasNextLine()) {
            arr = Arrays.copyOf(arr, arr.length + 1);
            arr[arr.length - 1] = in.nextLine();
        }

        return arr;
    }

    static void prtReadCol(String[] arr) {
        int maxLength = 0;
        for (String str : arr) {
            if (maxLength < str.length())
                maxLength = str.length();
        }

        for (int i = 0; i < maxLength; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i < arr[j].length()) System.out.print(arr[j].charAt(i));
            }
        }
    }
}
