package Backjoon.Silver.B6064;

import java.util.Scanner;

class Tuple<T> {
    T first;
    T second;

    public Tuple(T first, T second) {
        this.first = first;
        this.second = second;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while (t-- > 0) {
            Tuple<Integer> endYear = new Tuple<>(in.nextInt(), in.nextInt());
            Tuple<Integer> origin = new Tuple<>(in.nextInt(), in.nextInt());

            Tuple<Integer> calcYear = new Tuple<>(1, 1);
            int curYear = 1;

            while (true) {
                if (origin.first - calcYear.first == origin.second - calcYear.second) {
                    System.out.println(curYear + (origin.first - calcYear.first));
                    break;
                }

                int firstLeft = endYear.first - calcYear.first;
                int secondLeft = endYear.second - calcYear.second;
                if (firstLeft < secondLeft) {
                    curYear += firstLeft + 1;
                    calcYear.first = 1;
                    calcYear.second += firstLeft + 1;
                } else if (firstLeft > secondLeft) {
                    curYear += secondLeft + 1;
                    calcYear.first += secondLeft + 1;
                    calcYear.second = 1;
                } else {
                    System.out.println(-1);
                    break;
                }
            }
        }
    }
}
