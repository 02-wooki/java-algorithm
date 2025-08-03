package Backjoon.Silver.B2910;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

class FreqMap {
    List<Integer> keys;
    List<Integer> frequencies;
    int length;

    public FreqMap() {
        keys = new ArrayList<>();
        frequencies = new ArrayList<>();
        length = 0;
    }

    public void put(int key) {
        if (keys.contains(key)) {
            int index = keys.indexOf(key);
            frequencies.add(index, frequencies.get(index) + 1);
            frequencies.remove(index + 1);
        } else {
            keys.add(key);
            frequencies.add(1);
            length++;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < length; i++) {
            int maxFreq = 0, index = 0;
            for (int j = 0; j < keys.size(); j++) {
                if (frequencies.get(j) > maxFreq) {
                    maxFreq = frequencies.get(j);
                    index = j;
                }
            }

            for (int j = 0; j < maxFreq; j++)
                sb.append(keys.get(index) + " ");

            keys.remove(index);
            frequencies.remove(index);
        }

        return sb.toString();
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] t = in.readLine().split(" ");
        int n = Integer.parseInt(t[0]), c =  Integer.parseInt(t[1]);
        t = in.readLine().split(" ");

        FreqMap map = new FreqMap();
        for (int i = 0; i < n; i++)
            map.put(Integer.parseInt(t[i]));

        out.write(map.toString());

        out.flush();
    }
}
