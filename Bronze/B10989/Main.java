package Backjoon.Bronze.B10989;

import java.io.*;

/*
 *  Quick Sort 알고리즘 구현
 *  평균 시간복잡도 O(n log n)이지만 최악의 경우 O(n^2)으로 시간초과 엔딩
 *
 *  따라서 카운팅 정렬 O(n) 사용해서 푸는 문제
 *
 *  자바 스타일로 객체 만들어서 푸니까 시간초과
 *  ->  객체 저장하고 다시 toString 만들고 하는 시간 때문에 초과인지는 모르겠으나
 *      절차지향 코딩으로 다시 짜고 출력을 sout이 아닌 BufferedWriter로 바꾸니 통과되었음
 */

public class Main {
    public static void main(String[] args) throws IOException {

        // 입출력 스트림, 카운터 배열 선언
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int size = Integer.parseInt(in.readLine());
        int[] countingTable = new int[10001];

        // 입력받는 동시에 해당 인덱스를 1씩 증가하며 카운트
        for (int i = 0; i < size; i++) {
            countingTable[Integer.parseInt(in.readLine())]++;
        }

        // 출력
        for (int i = 0; i < countingTable.length; i++) {
            for (int j = 0; j < countingTable[i]; j++)
                out.write(i + "\n");
        }

        out.flush();
        out.close();
        in.close();
    }
}

class CountingSort {

    int[] countTable;

    public CountingSort(int[] arr, int max) {
        countTable = new int[max + 1];
        for (int i = 0; i < countTable.length; i++)
            countTable[i] = 0;

        for (int i = 0; i < arr.length; i++)
            countTable[arr[i]]++;
    }

    @Override
    public String toString() {
        String s = "";

        for (int i = 0; i < countTable.length; i++) {
            for (int j = 0; j < countTable[i]; j++)
                s = String.format("%s%d\n", s, i);
        }

        return s;
    }
}

class QuickSort {
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
