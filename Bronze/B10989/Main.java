package Backjoon.Bronze.B10989;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(in.readLine());
        int[] arr = new int[size];

        for (int i = 0; i < size; i++)
            arr[i] = Integer.parseInt(in.readLine());

        quickSort(arr);

        for (int i : arr)
            System.out.println(i);
    }

    public static void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // 가장 우측 값을 피벗으로 지정
            int pivot = high;

            // 피벗보다 작은 값은 왼쪽으로 옮김
            int i = low;
            for (int j = low; j < high; j++) {
                if (arr[j] < arr[pivot])
                    swap(arr, i++, j);
            }

            // 피벗보다 큰 값의 가장 왼쪽 요소와 피벗 교환
            swap(arr, i, pivot);
            pivot = i;

            // 다음 단계 호출 (분할정복)
            quickSort(arr, low, pivot - 1);
            quickSort(arr, pivot + 1, high);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}
