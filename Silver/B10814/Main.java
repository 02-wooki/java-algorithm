package Backjoon.Silver.B10814;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(in.readLine());
        List<List<String>> people = new ArrayList<>();
        for (int i = 0; i < 201; i++)
            people.add(new ArrayList<>());

        while (n-- > 0) {
            String[] line = in.readLine().split(" ");
            people.get(Integer.parseInt(line[0])).add(line[1]);
        }

        for (int i = 0; i < people.size(); i++) {
            if (people.get(i).isEmpty())
                continue;

            for (int j = 0; j < people.get(i).size(); j++) {
                out.write(i + " "+ people.get(i).get(j) + "\n");
            }
        }

        out.flush();
    }
}
