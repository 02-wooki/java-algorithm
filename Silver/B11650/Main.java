package Backjoon.Silver.B11650;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Coold implements Comparable<Coold> {
    int x, y;

    public Coold(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Coold o) {
        if (this.x == o.x)
            return this.y - o.y;
        else
            return this.x - o.x;
    }

    @Override
    public String toString() {
        return x + " " + y;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(in.readLine());
        List<Coold> coolds = new ArrayList<Coold>();

        while (n-- > 0) {
            String[] line = in.readLine().split(" ");
            coolds.add(new Coold(Integer.parseInt(line[0]), Integer.parseInt(line[1])));
        }

        Collections.sort(coolds);
        for (int i = 0; i < coolds.size(); i++) {
            out.write(coolds.get(i).toString() + "\n");
        }

        out.flush();
    }
}
