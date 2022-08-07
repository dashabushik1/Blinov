/**
 * 1. Создать классы, спецификации которых приведены ниже. Определить конструкторы и методы setТип(), getТип(), toString().
 * Определить дополнительно методы в классе, создающем массив объектов.
 * Задать критерий выбора данных и вывести эти данные на консоль.
 * В каждом классе, обладающем информацией, должно быть объявлено несколько конструкторов.
 * Student: id, Фамилия, Имя, Отчество, Дата рождения, Адрес, Телефон, Факультет, Курс, Группа.
 * Создать массив объектов. Вывести:
 * a) список студентов заданного факультета;
 * b) списки студентов для каждого факультета и курса;
 * c) список студентов, родившихся после заданного года;
 * d) список учебной группы.
 */
package chapter3.task1.student;

public class Student {
    private Long id;
    private Long phoneNumber;
    private String fullName;
    private String address;
    private String faculty;
    private int course;
    private int group;
    private int yearOfBirth;

    public Student(String fullName, String faculty, int course, int group, int yearOfBirth) {
        this(null, null, fullName, null, faculty, course, group, yearOfBirth);
    }

    public Student(Long id, Long phoneNumber, String fullName, String address, String faculty, int course, int group, int yearOfBirth) {
        if (fullName == null) {
            throw new RuntimeException("Full name must not be null!");
        }
        if (faculty == null) {
            throw new RuntimeException("Faculty must not be null!");
        }
        if (course <= 0) {
            throw new RuntimeException("Course must be positive number.");
        }
        if (yearOfBirth <= 1900) {
            throw new RuntimeException("Year of birth must be greater than 1900.");
        }
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.fullName = fullName;
        this.address = address;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
        this.yearOfBirth = yearOfBirth;
    }

    public Long getId() {
        return id;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public String getAddress() {
        return address;
    }

    public String getFaculty() {
        return faculty;
    }

    public int getCourse() {
        return course;
    }

    public int getGroup() {
        return group;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", phoneNumber=" + phoneNumber +
                ", fullName='" + fullName + '\'' +
                ", address='" + address + '\'' +
                ", faculty='" + faculty + '\'' +
                ", course=" + course +
                ", group=" + group +
                ", yearOfBirth=" + yearOfBirth +
                '}';
    }
}
