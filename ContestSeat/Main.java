package Backjoon.ContestSeat;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCase = in.nextInt();

        for (int i = 0; i < testCase; i++) {
            int p = in.nextInt(), m = in.nextInt();
            boolean[] isOccupied = new boolean[m + 1];

            int noSeatPerson = 0;

            for (int j = 0; j < p; j++) {
                int pick = in.nextInt();

                if (isOccupied[pick])
                    noSeatPerson++;
                isOccupied[pick] = true;
            }

            System.out.println(noSeatPerson);
        }
    }
}
