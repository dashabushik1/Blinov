package chapter3.task1.student;

public class StudentService {

    public Student[] getAll() {
        Student[] students = new Student[8];
        students[0] = new Student(1, "Petrov Ivan", "03.06.1995", "Minsk, Kaganca street 6/170", 2345612, "Faculty of Computer Design", 2, 122);
        students[1] = new Student(2, "Baranov Ilya", "08.12.1996", "Minsk, Aranskaya street 78/30", 5674839, "Faculty of Information Technology and Management", 3, 67);
        students[2] = new Student(3, "Strelkova Olga", "24.06.1994", "Minsk, Kiseleva street 34/189", 7653490, "Faculty of Computer Design", 4, 115);
        students[3] = new Student(4, "Jukov Evgeny", "15.03.1995", "Minsk, Asipenki street 56/290", 8906789, "Faculty of Computer Systems and Networks", 2, 122);
        students[4] = new Student(5, "Blinov Anatoly", "19.04.1996", "Minsk, Krapotkina street 3/330", 7832619, "Faculty of Computer Systems and Networks", 3, 123);
        students[5] = new Student(6, "Antonova Ekaterina", "29.07.1994", "Minsk, Cimiriazieva street 54/178", 8908880, "Faculty of Computer Design", 4, 122);
        students[6] = new Student(7, "Antoschenka Kristina", "12.11.1995", "Minsk, Adoeuskogo street, 67/88", 4543627, "Faculty of Information Technology and Management", 3, 67);
        students[7] = new Student(8, "Petrova Alina", "10.10.1996", "Minsk, Filimonova street 55/102", 6754030, "Faculty of Computer Systems and Networks", 3, 123);

        return students;
    }

    public Student[] filterByFaculty(Student[] students, String faculty) {
        Student[] faculties = new Student[students.length];
        int index = 0;
        for (Student student : students) {
            if ((student != null) && (faculty.equals(student.getFaculty()))) {
                faculties[index++] = student;
            }
        }
        return faculties;
    }

    public int findMaxCourse(Student[] students) {
        int course = 0;
        for (Student student : students) {
            if (course < student.getCourse()) {
                course = student.getCourse();
            }
        }
        return course;
    }

    public String[] findVarietyFaculties(Student[] students) {
        String[] faculties = new String[students.length];
        int index = 0;
        for (Student student : students) {
            if (student != null) {
                String studentFaculty = student.getFaculty();
                for (String faculty : faculties) {
                    if (!studentFaculty.equals(faculty)) {
                        faculties[index++] = student.getFaculty();
                    }
                }
            }
        }
        return faculties;
    }

    public Student[] filterByCourse(Student[] students, int course) {
        Student[] courses = new Student[students.length];
        int index = 0;
        for (Student st : students) {
            if (course == st.getCourse()) {
                courses[index++] = st;
            }
        }
        return courses;
    }
}



