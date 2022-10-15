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
        print(studentsByFaculty);

        Student[] studentsAfterYear = findStudentsAfterGivenYear(students, 1995);
        System.out.println("");
        System.out.println("The students born after 1995: ");
        print(studentsAfterYear);

        Student[] studentsByGroup = findStudentsByGroup(students, 199);
        System.out.println("");
        System.out.println("The students of group 199: ");
        print(studentsByGroup);


        System.out.println("");
        String[] faculties = findVariousFaculties(students);
        for (int i = 0; i < faculties.length; i++) {
            System.out.println("Faculty: " + faculties[i]);
        }

//        int[] variousCourses = findVariousCourses(students);
//        String[] variousFaculties = findVariousFaculties(students);
//        sort(variousCourses);
//        for (int i = 0; i < variousCourses.length; i++) {
//            System.out.println("-----------------");
//
//            System.out.println(variousCourses[i] + " course: ");
//            System.out.println("-----------------");
//            for (int j = 0; j < variousFaculties.length; j++) {
//                System.out.println("-----------------");
//                System.out.println("Faculty: " + variousFaculties[j]);
//                System.out.println("-----------------");
//                Student[] filteredStudents = findStudentsByFacultyAndCourse(students, variousFaculties[j], variousCourses[i]);
//                for (int k = 0; k < filteredStudents.length; k++) {
//                    System.out.println(students[k].getSurname() + " " + students[k].getName() + " " + students[k].getPatronymic());
//                }
//            }
//        }
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
        trim(filteredStudents);
        return filteredStudents;
    }


    private static Student[] findStudentsByFaculty(Student[] students, String faculty) { // метод ищет студентов определенного факультета
        Student[] foundedStudents = new Student[students.length];
        int studentIndex = 0;
        for (Student student : students) {
            if (student.getFaculty().equals(faculty)) {
                foundedStudents[studentIndex] = student;
                studentIndex++;
            }
        }
        trim(foundedStudents);
        return foundedStudents;
    }

    private static Student[] findStudentsAfterGivenYear(Student[] students, int date_of_birth_year) { // метод ищет студентов после заданного года рождения
        Student[] studentsAfterDefiniteYear = new Student[students.length];
        int studentIndex = 0;
        for (Student student : students) {
            if (student.getDate_of_birth_year() > date_of_birth_year) {
                studentsAfterDefiniteYear[studentIndex] = student;
                studentIndex++;
            }
        }
        trim(studentsAfterDefiniteYear);
        return studentsAfterDefiniteYear;
    }

    private static Student[] findStudentsByGroup(Student[] students, int group) { // метод ищет студентов определенной группы
        Student[] studentsByGroup = new Student[students.length];
        int studentIndex = 0;
        for (Student student : students) {
            if (student.getGroup() == group) {
                studentsByGroup[studentIndex] = student;
                studentIndex++;
            }
        }
        trim(studentsByGroup);
        return studentsByGroup;
    }

    private static Student[] findStudentsByCourse(Student[] students, int course) {
        Student[] tempStudents = new Student[students.length];
        int count = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i].getCourse() == course) {
                tempStudents[i] = students[i];
                ++count;
            }
        }
        Student[] result = new Student[count];
        int i = 0;
        for (Student student : tempStudents) {
            if (student != null) {
                result[i++] = student;
            }
        }
        return result;
    }

    private static String[] findVariousFaculties(Student[] students) {
        Student[] expectedFaculties = new Student[students.length];
        for (int i = 0; i < students.length; i++) {
            for (int j = i + 1; j < students.length; j++) {
                if (!students[i].getFaculty().equals(students[j].getFaculty())) {
                    expectedFaculties[i] = students[i];
                }
            }
        }
        int actualFacultiesCount = 0;
        for (int i = 0; i < expectedFaculties.length; i++) {
            if (expectedFaculties[i] != null) {
                actualFacultiesCount++;
            }
        }
        String[] actualFaculties = new String[actualFacultiesCount];
        for (int i = 0; i < expectedFaculties.length; i++) {
            if (expectedFaculties[i] != null) {
                actualFaculties[i] = expectedFaculties[i].getFaculty();
            }
        }
        return actualFaculties;
    }

    private static int[] findVariousCourses(Student[] students) {
        Student[] expectedCourses = new Student[students.length];
        for (int i = 0; i < students.length; i++) {
            for (int j = i + 1; j < students.length; j++) {
                if (students[i].getCourse() != students[j].getCourse()) {
                    expectedCourses[i] = students[i];
                }
            }
        }
        int actualCoursesCount = 0;
        for (int i = 0; i < expectedCourses.length; i++) {
            if (expectedCourses[i] != null) {
                actualCoursesCount++;
            }
        }
        int[] actualCourses = new int[actualCoursesCount];
        for (int i = 0; i < expectedCourses.length; i++) {
            if (expectedCourses[i] != null) {
                actualCourses[i] = expectedCourses[i].getCourse();
            }
        }
        return actualCourses;
    }

    private static void sort(int[] variousCourses) {
        for (int i = 0; i < variousCourses.length; i++) {
            for (int j = i + 1; j < variousCourses.length; j++) {
                if (variousCourses[i] > variousCourses[j]) {
                    int temp = variousCourses[i];
                    variousCourses[i] = variousCourses[j];
                    variousCourses[j] = temp;
                }
            }
        }
    }

    private static Student[] trim(Student[] students) {
        Student[] result = new Student[students.length];
        int j = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                result[j] = students[i];
                j++;
            }
        }
        return result;
    }

    private static void print(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                System.out.println(students[i].getSurname() + " " + students[i].getName() + " " +
                        students[i].getPatronymic());
            }
        }
    }
}