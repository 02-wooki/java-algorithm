package Backjoon.Bronze.B10699;

import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.printf("%d-%02d-%02d", c.get(Calendar.YEAR), c.get(Calendar.MONTH) + 1, c.get(Calendar.DATE));
    }
}
