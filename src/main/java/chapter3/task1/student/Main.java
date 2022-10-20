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
        int[] uniqueCourses = findUniqueCourses(students);
        sort(uniqueCourses);
        for (int course : uniqueCourses) {
            System.out.println("");
            System.out.println("Course: " + course);

            Student[] studentsByCourse = findStudentsByCourse(students, course);
            String[] uniqueFaculties = findUniqueFaculties(studentsByCourse);
            for (String faculty : uniqueFaculties) {
                System.out.println("-----------------------------------");
                System.out.println("Faculty: " + faculty);

                Student[] studentsByFacultyAndCourse = findStudentsByFaculty(students, faculty);
                for (Student student : studentsByFacultyAndCourse) {
                    if (student != null) {
                        if (student.getFaculty().equals(faculty) && student.getCourse() == course) {
                            System.out.println("Student(s): " + student.getSurname() + " " +
                                    student.getName() + " " + student.getPatronymic());
                        }
                    }
                }
            }
        }
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
        Student[] studentsByCourse = new Student[students.length]; // метод ищет студентов по курсу
        int count = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i].getCourse() == course) {
                studentsByCourse[i] = students[i];
                count++;
            }
        }
        Student[] result = new Student[count];
        int i = 0;
        for (Student student : studentsByCourse) {
            if (student != null) {
                result[i++] = student;
            }
        }
        return result;
    }

    private static String[] findUniqueFaculties(Student[] students) {
        String[] uniqueFaculties = new String[students.length]; // метод ищет уникальные факультеты
        for (int i = 0; i < students.length; i++) {
            String faculty = students[i].getFaculty();
            boolean unique = true;
            for (int j = 0; j < uniqueFaculties.length; j++) {
                if (faculty.equals(uniqueFaculties[j])) {
                    unique = false;
                }
            }
            if (unique) {
                for (int j = 0; j < uniqueFaculties.length; j++) {
                    if (uniqueFaculties[j] == null) {
                        uniqueFaculties[j] = faculty;
                        break;
                    }
                }
            }
        }
        int actualFacultiesCount = 0;
        for (int i = 0; i < uniqueFaculties.length; i++) {
            if (uniqueFaculties[i] != null) {
                actualFacultiesCount++;
            }
        }
        String[] result = new String[actualFacultiesCount];
        int j = 0;
        for (int i = 0; i < uniqueFaculties.length; i++) {
            if (uniqueFaculties[i] != null) {
                result[j] = uniqueFaculties[i];
                j++;
            }
        }
        return result;
    }

    private static int[] findUniqueCourses(Student[] students) { // метод ищет уникальные курсы
        int[] uniqueCourses = new int[students.length];
        for (int i = 0; i < students.length; i++) {
            int course = students[i].getCourse();
            boolean unique = true;
            for (int j = 0; j < uniqueCourses.length; j++) {
                if (course == uniqueCourses[j]) {
                    unique = false;
                }
            }
            if (unique) {
                for (int j = 0; j < uniqueCourses.length; j++) {
                    if (uniqueCourses[j] == 0) {
                        uniqueCourses[j] = course;
                        break;
                    }
                }
            }
        }
        int actualCoursesCount = 0;
        for (int i = 0; i < uniqueCourses.length; i++) {
            if (uniqueCourses[i] != 0) {
                actualCoursesCount++;
            }
        }
        int[] result = new int[actualCoursesCount];
        int j = 0;
        for (int i = 0; i < uniqueCourses.length; i++) {
            if (uniqueCourses[i] != 0) {
                result[j] = uniqueCourses[i];
                j++;
            }
        }
        return result;
    }

    private static void sort(int[] variousCourses) { // метод сортирует уникальные курсы в порядке возрастания
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

    private static Student[] trim(Student[] students) { // оставляет только не null элементы
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

    private static void print(Student[] students) { // метод выводит на консоль студентов
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                System.out.println(students[i].getSurname() + " " + students[i].getName() + " " +
                        students[i].getPatronymic());
            }
        }
    }
}