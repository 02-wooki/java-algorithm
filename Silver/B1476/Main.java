package Backjoon.Silver.B1476;

import java.util.Scanner;

class Triple {
    int first;
    int second;
    int third;

    int addToMax() {
        int firstLeft = 16 - first;
        int secondLeft = 29 - second;
        int thirdLeft = 20 - third;
        if (firstLeft <= Math.min(secondLeft, thirdLeft)) {
            second += firstLeft;
            third += firstLeft;
            first = 1;
            return firstLeft;
        } else if (secondLeft <= Math.min(firstLeft, thirdLeft)) {
            first +=  secondLeft;
            third += secondLeft;
            second = 1;
            return secondLeft;
        } else {
            first += thirdLeft;
            second += thirdLeft;
            third = 1;
            return thirdLeft;
        }
    }

    boolean equals(Triple triple) {
        return triple.first == first && triple.second == second && triple.third == third;
    }

    boolean almostEquals(Triple triple) {
        boolean result = true;

        if (triple.first - first != triple.second - second)
            result = false;
        if (triple.first - first != triple.third - third)
            result = false;
        if (triple.second - second != triple.third - third)
            result = false;

        return result;
    }

    public Triple() {
        first = 1;
        second = 1;
        third = 1;
    }

    public Triple(int x, int y, int z) {
        first = x;
        second = y;
        third = z;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Triple t = new Triple(in.nextInt(), in.nextInt(), in.nextInt());

        Triple i = new Triple();
        int year = 1;
        while (!t.almostEquals(i))
            year += i.addToMax();

        System.out.println(i.equals(t) ? year : year + (t.first - i.first));
    }
}
