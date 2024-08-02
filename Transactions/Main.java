package Backjoon.Transactions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNextLine()) {
            String lineString = in.nextLine();
            if (lineString.equals("0 W 0"))
                break;

            String[] lineArr = lineString.split(" ");
            int op1 = Integer.parseInt(lineArr[0]), op2 = Integer.parseInt(lineArr[2]);
            if (lineArr[1].equals("W")) {
                if (op1 - op2 < -200)
                    System.out.println("Not allowed");
                else
                    System.out.println(op1 - op2);
            } else
                System.out.println(op1 + op2);
        }
    }
}
