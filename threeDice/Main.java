package Backjoon.threeDice;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int[] dice = new int[3];
        boolean[] equals = {false, false, false};
        int equalsnum = 0;

        for (int i = 0; i < dice.length; i++)
            dice[i] = in.nextInt();
        Arrays.sort(dice);

        if (dice[0] == dice[1]) {
            equals[0] = true;
            equalsnum++;
        }
        if (dice[0] == dice[2]) {
            equals[1] = true;
            equalsnum++;
        }
        if (dice[1] == dice[2]) {
            equals[2] = true;
            equalsnum++;
        }

        if (equalsnum == 3)
            System.out.println(10000 + dice[0] * 1000);
        else if (equalsnum == 1) {
            if (equals[0] | equals[1])
                System.out.println(1000 + dice[0] * 100);
            else
                System.out.println(1000 + dice[2] * 100);
        } else if (equalsnum == 0)
            System.out.println(100 * dice[2]);
    }
}
