package chapter3.task1.student;

public class Main {

    public static void main(String[] args) {

        Student[] students = new Student[]{
                new Student(1L, 2567834L, "Petrov", "Ivan", "Ivanovich", "Minsk, Kaganca street 6/170",
                        "Faculty of Computer Design", 12, 12, 1995, 3, 199),
                new Student(2L, 3784531L, "Baranov", "Ilya", "Alekseevich", "Minsk, Aranskaya street 78/30",
                        "Faculty of Information Technology and Management", 13, 8, 1994, 4, 196),
                new Student(3L, 4899006L, "Strelkova", "Olga", "Ivanovna", "Minsk, Kiseleva street 34/189",
                        "Faculty of Computer Design", 6, 3, 1996, 2, 195),
                new Student(4L, 2904532L, "Jukov", "Evgeny", "Petrovich", "Minsk, Asipenki street 56/290",
                        "Faculty of Computer Systems and Networks", 9, 9, 1995, 1, 199),
                new Student(5L, 3901212L, "Blinov", "Anatoly", "Olegovich", "Minsk, Krapotkina street 3/330",
                        "Faculty of Computer Systems and Networks", 15, 7, 1996, 3, 199),
                new Student(6L, 4785640L, "Antonova", "Ekaterina", "Vladimirovna", "Minsk, Cimiriazieva street 54/178",
                        "Faculty of Computer Design", 4, 8, 1997, 2, 196),
                new Student(7L, 3678903L, "Antoschenka", "Kristina", "Pavlovna", "Minsk, Adoeuskogo street, 67/88",
                        "Faculty of Information Technology and Management", 5, 5, 1994, 4, 196),
                new Student(8L, 3906512L, "Petrova", "Alina", "Dmitrievna", "Minsk, Filimonova street 55/102",
                        "Faculty of Computer Systems and Networks", 24, 4, 1995, 3, 195),
        };


        Student[] studentsByFaculty = findStudentsByFaculty(students, "Faculty of Computer Systems and Networks");
        System.out.println("The students of the faculty of Computer Systems and Networks are: ");
        for (int i = 0; i < studentsByFaculty.length; i++) {
            System.out.println(studentsByFaculty[i].getSurname() + " " + studentsByFaculty[i].getName() + " " +
                    studentsByFaculty[i].getPatronymic());
        }

        System.out.println("");
        System.out.println("Students by faculties and courses: ");


        Student[] studentsAfterYear = findStudentsAfterGivenYear(students, 1995);
        System.out.println("");
        System.out.println("The students born after 1995: ");
        for (int i = 0; i < studentsAfterYear.length; i++) {
            if (studentsAfterYear[i] != null) {
                System.out.println(studentsAfterYear[i].getSurname() + " " + studentsAfterYear[i].getName() + " " +
                        studentsAfterYear[i].getPatronymic());
            }
        }

        Student[] studentsByGroup = findStudentsByGroup(students, 199);
        System.out.println("");
        System.out.println("The students of group 199: ");
        for (int i = 0; i < studentsByGroup.length; i++) {
            if (studentsByGroup[i] != null) {
                System.out.println(studentsByGroup[i].getSurname() + " " + studentsByGroup[i].getName() + " " +
                        studentsByGroup[i].getPatronymic());
            }
        }
    }

    private static Student[] findStudentsByFaculty(Student[] students, String faculty) {
        Student[] foundedStudents = new Student[students.length];
        int studentIndex = 0;
        for (Student student : students) {
            if (student.getFaculty().equals(faculty)) {
                foundedStudents[studentIndex] = student;
                studentIndex++;
            }
        }
        Student[] actualFoundedStudents = new Student[studentIndex];
        for (int i = 0; i < studentIndex; i++) {
            actualFoundedStudents[i] = foundedStudents[i];
        }
        return actualFoundedStudents;
    }

    private static Student[] findStudentsByFacultyAndCourse(Student[] students, String faculty, int course) {
        Student[] filteredStudents = new Student[students.length];
        for (int i = 0; i < students.length; i++) {
            if (students[i].getFaculty().equals(faculty) && students[i].getCourse() == course) {
                filteredStudents[i] = students[i];
            }
        }
        int actualStudentsCount = 0;
        for (int i = 0; i < filteredStudents.length; i++) {
            if (filteredStudents[i] != null) {
                actualStudentsCount++;
            }
        }
        Student[] actualStudents = new Student[actualStudentsCount];
        int j = 0;
        for (int i = 0; i < filteredStudents.length; i++) {
            if (filteredStudents[i] != null) {
                actualStudents[j] = filteredStudents[i];
            }
        }
        return actualStudents;
    }

    private static Student[] findStudentsAfterGivenYear(Student[] students, int date_of_birth_year) {
        Student[] studentsAfterDefiniteYear = new Student[students.length];
        int studentIndex = 0;
        for (Student student : students) {
            if (student.getDate_of_birth_year() > date_of_birth_year) {
                studentsAfterDefiniteYear[studentIndex] = student;
                studentIndex++;
            }
        }
        return studentsAfterDefiniteYear;
    }

    private static Student[] findStudentsByGroup(Student[] students, int group) {
        Student[] studentsByGroup = new Student[students.length];
        int studentIndex = 0;
        for (Student student : students) {
            if (student.getGroup() == group) {
                studentsByGroup[studentIndex] = student;
                studentIndex++;
            }
        }
        return studentsByGroup;
    }
}
