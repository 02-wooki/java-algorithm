package Backjoon.Silver.B1431;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Serial implements Comparable<Serial> {
    String data;

    public Serial(String data) {
        this.data = data;
    }

    @Override
    public int compareTo(Serial o) {
        if (this.data.length() != o.data.length())
            return this.data.length() - o.data.length();
        else {
            int thisNum = 0, otherNum = 0;
            for (int i = 0; i < this.data.length(); i++) {
                if (this.data.charAt(i) - '0' < 10)
                    thisNum += this.data.charAt(i) - '0';
                if (o.data.charAt(i) - '0' < 10)
                    otherNum += o.data.charAt(i) - '0';
            }

            if (thisNum == otherNum)
                return this.data.compareTo(o.data);
            else
                return thisNum - otherNum;
        }
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(in.readLine());
        List<Serial> serials = new ArrayList<Serial>();
        while (n-- > 0)
            serials.add(new Serial(in.readLine()));

        Collections.sort(serials);

        for (Serial s: serials)
            out.write(s.data + "\n");

        out.flush();
    }
}
