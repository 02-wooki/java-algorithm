package Backjoon.Silver.B1735;

import java.util.Scanner;

public class Main {

    static int getGcd(int a, int b) {
        return a % b  == 0 ? b : getGcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int xChild =  in.nextInt(), xParent =  in.nextInt();
        int yChild =  in.nextInt(), yParent =  in.nextInt();

        int childRes = xChild * yParent + yChild * xParent;
        int parentRes = xParent * yParent;

        System.out.println(childRes / getGcd(childRes, parentRes) + " " + parentRes / getGcd(childRes, parentRes));
    }
}
