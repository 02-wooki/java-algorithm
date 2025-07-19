package Backjoon.Gold.B1456;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<Long> getSosu(int max) {
        List<Long> list = new ArrayList<>();
        boolean[] isNotSosu = new boolean[max + 1];

        for (int i = 2; i < isNotSosu.length; i++) {
            if (isNotSosu[i]) continue;
            for (int j = i + i; j < isNotSosu.length; j += i)
                isNotSosu[j] = true;
        }

        for (int i = 2; i < isNotSosu.length; i++)
            if (!isNotSosu[i]) list.add((long)i);
        return list;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a =  in.nextLong(), b = in.nextLong();

        List<Long> sosus = getSosu((int)Math.sqrt(b));

        int count = 0;
        for (long i: sosus) {
            for (long j = (long)Math.pow(i, 2.0); j <= b; j *= i) {
                if (j >= a)
                    count++;
                if (j > b / i)
                    break;
            }
        }

        System.out.println(count);
    }
}
