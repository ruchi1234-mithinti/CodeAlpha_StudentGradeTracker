// Main.java

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        GradeManager manager = new GradeManager();

        int choice;

        do {

            System.out.println("\n===== Student Grade Tracker =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display Report");
            System.out.println("3. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    try {

                        System.out.print("\nEnter Student ID: ");
                        int id = sc.nextInt();

                        sc.nextLine();

                        System.out.print("Enter Student Name: ");
                        String name = sc.nextLine();

                        ArrayList<Integer> marks = new ArrayList<>();

                        for (int i = 1; i <= 5; i++) {

                            System.out.print("Enter marks for subject " + i + ": ");

                            int mark = sc.nextInt();

                            if (mark < 0 || mark > 100) {
                                throw new IllegalArgumentException("Marks should be between 0 and 100");
                            }

                            marks.add(mark);
                        }

                        Student student = new Student(id, name, marks);

                        manager.addStudent(student);

                        System.out.println("\nStudent added successfully.");

                    } catch (Exception e) {

                        System.out.println("\nInvalid input: " + e.getMessage());
                        sc.nextLine();
                    }

                    break;

                case 2:

                    manager.displayStudents();
                    break;

                case 3:

                    System.out.println("\nProgram closed.");
                    break;

                default:

                    System.out.println("\nInvalid choice.");
            }

        } while (choice != 3);

        sc.close();
    }
}