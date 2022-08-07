package chapter3.task1.student;

public class Main {

    public static void main(String[] args) {

        Student[] students = new Student[]{
                new Student(1L, 2345612L, "Petrov Ivan", "Minsk, Kaganca street 6/170",
                        "Faculty of Computer Design", 2, 122, 1995),
                new Student(2L, 5674839L, "Baranov Ilya", "Minsk, Aranskaya street 78/30",
                        "Faculty of Information Technology and Management", 3, 67, 1996),
                new Student(3L, 653490L, "Strelkova Olga", "Minsk, Kiseleva street 34/189",
                        "Faculty of Computer Design", 4, 115, 1994),
                new Student(4L, 8906789L, "Jukov Evgeny", "Minsk, Asipenki street 56/290",
                        "Faculty of Computer Systems and Networks", 2, 122, 1995),
                new Student(5L, 7832619L, "Blinov Anatoly", "Minsk, Krapotkina street 3/330",
                        "Faculty of Computer Systems and Networks", 3, 123, 1996),
                new Student(6L, 8908880L, "Antonova Ekaterina", "Minsk, Cimiriazieva street 54/178",
                        "Faculty of Computer Design", 4, 122, 1994),
                new Student(7L, 4543627L, "Antoschenka Kristina", "Minsk, Adoeuskogo street, 67/88",
                        "Faculty of Information Technology and Management", 3, 67, 1995),
                new Student(8L, 6754030L, "Petrova Alina", "Minsk, Filimonova street 55/102",
                        "Faculty of Computer Systems and Networks", 3, 123, 1993),
        };

        Student[] studentsByOneFaculty = findByFaculty(students, "Faculty of Computer Systems and Networks");
        System.out.println("The students of the faculty of Computer Systems and Networks are: ");
        for (int i = 0; i < studentsByOneFaculty.length; i++) {
            System.out.println("Student: " + studentsByOneFaculty[i].getFullName());
        }


        Student[] listOfStudentsBornAfterGivenYear = findStudentsAfterGivenYear(students, 1994);
        System.out.println("All students born after 1994: ");
        for (int i = 0; i < listOfStudentsBornAfterGivenYear.length; i++) {
            if (listOfStudentsBornAfterGivenYear[i] != null) {
                System.out.println("Student: " + listOfStudentsBornAfterGivenYear[i].getFullName());
            }
        }
    }

    private static Student[] findByFaculty(Student[] students, String faculty) {
        Student[] expectedFacultyStudents = new Student[students.length];
        int studentIndex = 0;
        for (Student student : students) {
            if (student.getFaculty().equals(faculty)) {
                expectedFacultyStudents[studentIndex] = student;
                studentIndex++;
            }
        }
        Student[] actualFacultyStudents = new Student[studentIndex];
        for (int i = 0; i < studentIndex; i++) {
            actualFacultyStudents[i] = expectedFacultyStudents[i];
        }
        return actualFacultyStudents;
    }

    private static Student[] findStudentsByFacultyAndCourse(Student[] students, String faculty, int course) {
        Student[] filteredStudents = new Student[students.length]; // как вывести на консоль этот метод?
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
        for (int i = 0; i < filteredStudents.length; i++) {
            if (filteredStudents[i] != null) {
                int j = 0;
                while (actualStudents[j] != null) {
                    j++;
                }
                actualStudents[j] = filteredStudents[i];
            }
        }
        return actualStudents;
    }

    private static Student[] findStudentsAfterGivenYear(Student[] students, int yearOfBirth) {
        Student[] studentsYearOfBirth = new Student[students.length];
        int yearIndex = 0;
        for (Student student : students) {
            if (student.getYearOfBirth() > yearOfBirth) {
                studentsYearOfBirth[yearIndex] = student;
                yearIndex++;
            }
        }
        return studentsYearOfBirth;
    }
}


