package Backjoon.Silver.B2217;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        List<Integer> ropes = new ArrayList<>();
        for (int i = 0; i < n; i++)
            ropes.add(in.nextInt());

        Collections.sort(ropes);
        Collections.reverse(ropes);

        int weight = 0;
        for (int i = 0; i < n; i++)
            if (ropes.get(i) * (i + 1) >= weight)
                weight = ropes.get(i) * (i + 1);

        System.out.println(weight);
    }
}
