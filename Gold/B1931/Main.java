package Backjoon.Gold.B1931;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Tuple {
    int first;
    int second;

    Tuple(int first, int last) {
        this.first = first;
        this.second = last;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Tuple> list = new ArrayList<Tuple>();

        int n = in.nextInt();
        while (n-- > 0)
            list.add(new Tuple(in.nextInt(), in.nextInt()));

        list.sort((o1, o2) -> {
            if (o1.second == o2.second) return o1.first - o2.first;
            else  return o1.second - o2.second;
        });

        int time = 0, count = 0;
        for (Tuple t : list) {
            if (time <= t.first) {
                count++;
                time = t.second;
            }
        }

        System.out.println(count);
    }
}