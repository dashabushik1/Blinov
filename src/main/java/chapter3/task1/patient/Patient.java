/**
 * 3. Создать классы, спецификации которых приведены ниже. Определить конструкторы и методы setТип(), getТип(), toString().
 * Определить дополнительно методы в классе, создающем массив объектов.
 * Задать критерий выбора данных и вывести эти данные на консоль.
 * В каждом классе, обладающем информацией, должно быть объявлено несколько конструкторов.
 * Patient: id, Фамилия, Имя, Отчество, Адрес, Телефон, Номер медицинской карты, Диагноз.
 * Создать массив объектов. Вывести:
 * a) список пациентов, имеющих данный диагноз;
 * b) список пациентов, номер медицинской карты которых находится в заданном интервале.
 */

package chapter3.task1.patient;

public class Patient {

    private Long id;
    private String surname;
    private String name;
    private String patronymic;
    private String address;
    private String phone_number;
    private String diagnosis;
    private int medical_card_number;

    public Patient(String surname, String name, String patronymic, String diagnosis, int medical_card_number) {
        this(null, surname, name, patronymic, null, null, diagnosis, medical_card_number);
    }

    public Patient(Long id, String surname, String name, String patronymic, String address, String phone_number,
                   String diagnosis, int medical_card_number) {
        if (surname == null) {
            throw new RuntimeException("Surname must not be null!");
        }
        if (name == null) {
            throw new RuntimeException("Name must not be null!");
        }
        if (patronymic == null) {
            throw new RuntimeException("Patronymic must not be null!");
        }
        if (diagnosis == null) {
            throw new RuntimeException("Diagnosis must not be null!");
        }
        if (medical_card_number <= 0) {
            throw new RuntimeException("Medical card number must not be null!");
        }
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.address = address;
        this.phone_number = phone_number;
        this.diagnosis = diagnosis;
        this.medical_card_number = medical_card_number;
    }

    public Long getId() {
        return id;
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

    public String getPhone_number() {
        return phone_number;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public int getMedical_card_number() {
        return medical_card_number;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", address='" + address + '\'' +
                ", phone_number='" + phone_number + '\'' +
                ", diagnosis='" + diagnosis + '\'' +
                ", medical_card_number=" + medical_card_number +
                '}';
    }
}
