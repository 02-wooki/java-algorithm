package Backjoon.Bronze.B2309;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int sum = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            list.add(in.nextInt());
            sum += list.get(i);
        }

        Collections.sort(list);

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (i == j)
                    continue;

                if (sum - list.get(i) - list.get(j) == 100) {
                    for (int k = 0; k < 9; k++) {
                        if (k == i || k == j)
                            continue;
                        System.out.println(list.get(k));
                    }
                    return;
                }
            }
        }
    }
}
