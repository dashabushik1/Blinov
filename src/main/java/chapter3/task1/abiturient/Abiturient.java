/**
 * 4. Создать классы, спецификации которых приведены ниже. Определить конструкторы и методы setТип(), getТип(), toString().
 * Определить дополнительно методы в классе, создающем массив объектов.
 * Задать критерий выбора данных и вывести эти данные на консоль.
 * В каждом классе, обладающем информацией, должно быть объявлено несколько конструкторов.
 * Abiturient: id, Фамилия, Имя, Отчество, Адрес, Телефон, Оценки.
 * Создать массив объектов. Вывести:
 * a) список абитуриентов, имеющих неудовлетворительные оценки;
 * b) список абитуриентов, у которых сумма баллов выше заданной;
 * c) выбрать заданное число n абитуриентов, имеющих самую высокую
 * сумму баллов (вывести также полный список абитуриентов, имеющих
 * полупроходную сумму).
 */

package chapter3.task1.abiturient;

public class Abiturient {

    private Long ID;
    private String surname;
    private String name;
    private String patronymic;
    private String address;
    private String phone;
    private int[] marks;

    public Abiturient(String surname, String name, String patronymic, int[] marks) {
        this(null, surname, name, patronymic, null, null, marks);
    }

    public Abiturient(Long ID, String surname, String name, String patronymic, String address, String phone, int[] marks) {
        if (surname == null) {
            throw new RuntimeException("Surname must not be null!");
        }
        if (name == null) {
            throw new RuntimeException("Name must not be null!");
        }
        if (patronymic == null) {
            throw new RuntimeException("Patronymic must not be null!");
        }
        if (marks == null) {
            throw new RuntimeException("Marks must not be null!");
        }
        this.ID = ID;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.address = address;
        this.phone = phone;
        this.marks = marks;
    }

    public Long getId() {
        return ID;
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

    public String getPhone() {
        return phone;
    }

    public int[] getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "Abiturient{" +
                "id=" + ID +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", marks=" + marks +
                '}';
    }
}
