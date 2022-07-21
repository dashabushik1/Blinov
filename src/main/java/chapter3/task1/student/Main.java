package chapter3.task1.student;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        StudentService service = new StudentService();

        Student[] students = service.getAll();

        Student[] studentsFilterByFaculty = service.filterByFaculty(students, "Faculty of Computer Systems and Networks");
        System.out.println("The students of the faculty of Computer Systems and Networks are: ");
        for (int i = 0; i < studentsFilterByFaculty.length; i++) {
            if (studentsFilterByFaculty[i] != null) {
                System.out.println(studentsFilterByFaculty[i].getFullName());
            }
        }


    }
}
