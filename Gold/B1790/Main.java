package Backjoon.Gold.B1790;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), k = in.nextInt();

        long x = 1, maxLength = 0, lengthPointer = 0;

        // n과 자리수가 같은 10의 제곱수까지 이어 쓴 글자수 구하기
        while (Math.pow(10, x) <= n) {
            maxLength += x * ((long) Math.pow(10.0, x) - (long) Math.pow(10.0, x - 1));
            if (maxLength > k)
                break;

            lengthPointer = maxLength;
            x++;
        }

        // n까지 이어 쓴 문자열 길이 구하기
        maxLength += x * (n - (long)Math.pow(10.0, x - 1) + 1);
        if (maxLength < k) {              // k가 문자열의 길이를 초과하는 경우
            System.out.println(-1);
            return;
        }
        // k번째 문자 구하기
        long leftLength = k - lengthPointer;
        String s = String.valueOf((leftLength - 1) / x + (long)Math.pow(10.0, x - 1));
        System.out.println(s.charAt((int)(leftLength - 1) % (int)x));
    }
}