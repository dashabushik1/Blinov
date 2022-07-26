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
    private long id, phoneNumber;
    private String fullName, dateOfBirth, address, faculty;
    private int course, group;

    public Student(long id, String fullName, String dateOfBirth, String address,
                   long phoneNumber, String faculty, int course, int group) {
        this.id = id;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", phoneNumber=" + phoneNumber +
                ", fullName='" + fullName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", address='" + address + '\'' +
                ", faculty='" + faculty + '\'' +
                ", course=" + course +
                ", group=" + group +
                '}';
    }
}
