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
    private Long telephone_number;
    private String surname;
    private String name;
    private String patronymic;
    private String address;
    private String faculty;
    private int date_of_birth_day;
    private int date_of_birth_month;
    private int date_of_birth_year;
    private int course;
    private int group;

    public Student(String surname, String name, String patronymic, String faculty, int date_of_birth_day, int date_of_birth_month, int date_of_birth_year, int course, int group) {
        this(null, null, surname, name, patronymic, null, faculty, date_of_birth_day, date_of_birth_month, date_of_birth_year, course, group);
    }

    public Student(Long id, Long telephone_number, String surname, String name, String patronymic, String address, String faculty, int date_of_birth_day, int date_of_birth_month, int date_of_birth_year, int course, int group) {
        if (surname == null) {
            throw new RuntimeException("Surname must not be null!");
        }
        if (name == null) {
            throw new RuntimeException("Name must not be null!");
        }
        if (patronymic == null) {
            throw new RuntimeException("Patronymic must not be null!");
        }
        if (faculty == null) {
            throw new RuntimeException("Faculty must not be null!");
        }
        if (date_of_birth_year <= 1990) {
            throw new RuntimeException("Year of birthday must not be null!");
        }
        if (course <= 0) {
            throw new RuntimeException("Course must be positive number!");
        }
        if (group <= 0) {
            throw new RuntimeException("Group must be positive number!");
        }
        this.id = id;
        this.telephone_number = telephone_number;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.address = address;
        this.faculty = faculty;
        this.date_of_birth_day = date_of_birth_day;
        this.date_of_birth_month = date_of_birth_month;
        this.date_of_birth_year = date_of_birth_year;
        this.course = course;
        this.group = group;
    }

    public Long getID() {
        return id;
    }

    public Long getTelephone_number() {
        return telephone_number;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getAddress() {
        return address;
    }

    public String getFaculty() {
        return faculty;
    }

    public int getDate_of_birth_day() {
        return date_of_birth_day;
    }

    public int getDate_of_birth_month() {
        return date_of_birth_month;
    }

    public int getDate_of_birth_year() {
        return date_of_birth_year;
    }

    public int getCourse() {
        return course;
    }

    public int getGroup() {
        return group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + id +
                ", telephone_number=" + telephone_number +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", address='" + address + '\'' +
                ", faculty='" + faculty + '\'' +
                ", date_of_birth_day=" + date_of_birth_day +
                ", date_of_birth_month=" + date_of_birth_month +
                ", date_of_birth_year=" + date_of_birth_year +
                ", course=" + course +
                ", group=" + group +
                '}';
    }
}
