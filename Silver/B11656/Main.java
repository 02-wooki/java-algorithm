package Backjoon.Silver.B11656;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        String origin = in.nextLine();

        List<String> suffixes = new ArrayList<>();
        for (int i = 0; i < origin.length(); i++)
            suffixes.add(origin.substring(i));

        Collections.sort(suffixes);

        for (String s: suffixes)
            out.write(s + "\n");

        out.flush();
    }
}
