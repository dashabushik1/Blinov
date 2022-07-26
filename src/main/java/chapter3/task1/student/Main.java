package chapter3.task1.student;

public class Main {

    public static void main(String[] args) {

        StudentService service = new StudentService();

        Student[] students = service.getAll();

        Student[] studentsFilterByFaculty = service.filterByFaculty(students, "Faculty of Computer Systems and Networks");
        System.out.println("The students of the faculty of Computer Systems and Networks are: ");
        for (int i = 0; i < studentsFilterByFaculty.length; i++) {
            if (studentsFilterByFaculty[i] != null) {
                System.out.println("Student: " + studentsFilterByFaculty[i].getFullName());
            }
        }

        int maxCourse = service.findMaxCourse(students);

        System.out.println(" ");
        System.out.println("Students by faculties and courses: ");
        for (int course = 1; course <= maxCourse; course++) {
            Student[] studentsByCourse = service.filterByCourse(students, course);
            String[] varietyFaculties = service.findVarietyFaculties(studentsByCourse);
            if (varietyFaculties.length != 0) {
                System.out.println("Course: " + course);
            }
            for (int i = 0; i < varietyFaculties.length; i++) {
                Student[] studentsByCourseAndFaculty
                        = service.filterByFaculty(studentsByCourse, varietyFaculties[i]);
                System.out.println("Faculty: " + varietyFaculties[i]);
                for (int j = 0; j < studentsByCourseAndFaculty.length; j++) {
                    System.out.println("Student: " + studentsByCourseAndFaculty[j].getFullName());
                }
            }
        }
    }
}

