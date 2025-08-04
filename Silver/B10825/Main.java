package Backjoon.Silver.B10825;


import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{
    String name;
    int korean, english, math;

    public Student(String line) {
        String[] tokens = line.split(" ");
        this.name = tokens[0];
        this.korean = Integer.parseInt(tokens[1]);
        this.english = Integer.parseInt(tokens[2]);
        this.math = Integer.parseInt(tokens[3]);
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Student o) {
        if (this.korean != o.korean)
            return (this.korean - o.korean) * -1;
        else if (this.english != o.english)
            return this.english - o.english;
        else if (this.math != o.math)
            return (this.math - o.math) * -1;
        return this.name.compareTo(o.name);
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(in.readLine());
        List<Student> students = new ArrayList<>();

        for (int i = 0; i < n; i++)
            students.add(new Student(in.readLine()));

        Collections.sort(students);
        for (Student s: students)
            out.write(s + "\n");
        out.flush();
    }
}
