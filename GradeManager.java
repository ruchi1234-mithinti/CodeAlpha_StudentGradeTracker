// GradeManager.java

import java.util.ArrayList;

public class GradeManager {

    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayStudents() {

        if (students.isEmpty()) {

            System.out.println("\nNo student records found.");
            return;
        }

        System.out.println("\n----- Student Report -----");

        for (Student student : students) {

            System.out.println(student);
            System.out.println("--------------------------");
        }
    }
}