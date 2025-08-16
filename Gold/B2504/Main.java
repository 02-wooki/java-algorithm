package Backjoon.Gold.B2504;

import java.io.*;
import java.util.Stack;

public class Main {
    static public boolean isOpenTrace(char c) {
        return c == '(' || c == '[';
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String x = in.readLine();
        Stack<Character> stack = new Stack<>();

        int res = 0, sect = 1;
        for (char c: x.toCharArray()) {
            if (isOpenTrace(c)) {
                if (sect != 1) {
                    for (char i : stack)
                        sect *= i == ')' ? 2 : 3;
                    res += sect;

                    sect = 1;
                }

                stack.push(c == '(' ? ')' : ']');
            } else {
                char popped;
                if (stack.isEmpty() || (popped = stack.pop()) != c) {
                    System.out.println(0);
                    return;
                }
                sect *= popped == ')' ? 2 : 3;
            }
        }

        if (!stack.isEmpty())
            System.out.println(0);
        else
            System.out.println(res + sect);
    }
}
