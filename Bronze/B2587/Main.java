package Backjoon.Bronze.B2587;

import java.util.*;

public class Main {

    static int average(List<Integer> n) {
        int sum = 0;
        for (Integer i: n)
            sum += i;
        return sum / n.size();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        List<Integer> n = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            n.add(in.nextInt());
        }

        Collections.sort(n);

        System.out.println(average(n));
        System.out.println(n.get(2));
    }
}
