package Backjoon.Silver.groupWordChecker;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 0;

        for (int i = 0; i < n; i++) {
            char[] c = in.next().toCharArray();
            count += checkWord(c) ? 1 : 0;
        }

        System.out.println(count);

    }

    static boolean checkWord(char[] c) {

        // 사용된 알파벳을 저장하는 변수 생성 및 초기화
        boolean[] usedAlpha = new boolean[26];
        for (int i = 0; i < usedAlpha.length; i++)
            usedAlpha[i] = false;
        usedAlpha[c[0] - 'a'] = true;

        // 검사
        for (int i = 1; i < c.length; i++) {
            if (c[i] != c[i - 1] && usedAlpha[c[i] - 'a'])
                return false;
            else
                usedAlpha[c[i] - 'a'] = true;
        }

        return true;
    }
}
