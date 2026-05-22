// Student.java

import java.util.ArrayList;

public class Student {

    private int id;
    private String name;
    private ArrayList<Integer> marks;

    public Student(int id, String name, ArrayList<Integer> marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public double getAverage() {

        int total = 0;

        for (int mark : marks) {
            total += mark;
        }

        return (double) total / marks.size();
    }

    public int getHighest() {

        int highest = marks.get(0);

        for (int mark : marks) {

            if (mark > highest) {
                highest = mark;
            }
        }

        return highest;
    }

    public int getLowest() {

        int lowest = marks.get(0);

        for (int mark : marks) {

            if (mark < lowest) {
                lowest = mark;
            }
        }

        return lowest;
    }

    @Override
    public String toString() {

        return "\nStudent ID : " + id +
               "\nName       : " + name +
               "\nMarks      : " + marks +
               "\nAverage    : " + String.format("%.2f", getAverage()) +
               "\nHighest    : " + getHighest() +
               "\nLowest     : " + getLowest();
    }
}