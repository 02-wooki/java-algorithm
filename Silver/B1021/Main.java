package Backjoon.Silver.B1021;

import java.util.Scanner;

class CircleQueue {
    int[] data;
    int head;
    int size;

    public CircleQueue(int size) {
        data = new int[size];
        this.size = size;
        for (int i = 1; i <= size; i++)
            data[i - 1] = i;
    }

    public int moveTo(int targetData) {
        int right = head, left = head, moveCount = 0;
        while (data[right] != targetData && data[left] != targetData) {
            moveCount++;
            right = (right + 1) % size;
            left = (left - 1 + size) % size;
        }

        if (data[right] == targetData) {
            head = right;
            remove(right);
            return moveCount;
        }

        head = left;
        remove(left);
        return moveCount;
    }

    private void remove(int index) {
        for (int i = index; i < size - 1; i++)
            data[i] = data[i + 1];
        --size;
        if (size <= head)
            head = 0;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        CircleQueue q = new CircleQueue(in.nextInt());
        int m = in.nextInt();
        int res = 0;

        while (m-- > 0) {
            res += q.moveTo(in.nextInt());
        }

        System.out.println(res);
    }
}
