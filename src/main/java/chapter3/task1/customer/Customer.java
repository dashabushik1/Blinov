/**
 * 2. Создать классы, спецификации которых приведены ниже. Определить конструкторы и методы setТип(), getТип(), toString().
 * Определить дополнительно методы в классе, создающем массив объектов. Задать критерий выбора данных и вывести эти данные на консоль.
 * В каждом классе, обладающем информацией, должно быть объявлено несколько конструкторов.
 * Customer: id, Фамилия, Имя, Отчество, Адрес, Номер кредитной карточки, Номер банковского счета.
 * Создать массив объектов. Вывести:
 * a) список покупателей в алфавитном порядке;
 * b) список покупателей, у которых номер кредитной карточки находится в заданном интервале.
 */
package chapter3.task1.customer;

public class Customer {

    private Long id;
    private String surname;
    private String name;
    private String patronymic;
    private String address;
    private int credit_card_number;
    private String account_number;

    public Customer(String surname, String name, String patronymic, int credit_card_number) {
        this(null, surname, name, patronymic, null, credit_card_number, null);
    }

    public Customer(Long id, String surname, String name, String patronymic, String address, int credit_card_number, String account_number) {
        if (surname == null) {
            throw new RuntimeException("Surname must not be null!");
        }
        if (name == null) {
            throw new RuntimeException("Name must not be null!");
        }
        if (patronymic == null) {
            throw new RuntimeException("Patronymic must not be null!");
        }
        if (credit_card_number <= 0) {
            throw new RuntimeException("Credit card number must not be null!");
        }
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.address = address;
        this.credit_card_number = credit_card_number;
        this.account_number = account_number;
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

    public long getCredit_card_number() {
        return credit_card_number;
    }

    public String getAccount_number() {
        return account_number;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", address='" + address + '\'' +
                ", credit_card_number='" + credit_card_number + '\'' +
                ", account_number='" + account_number + '\'' +
                '}';
    }
}
