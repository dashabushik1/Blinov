/**
 * 5. Создать классы, спецификации которых приведены ниже. Определить конструкторы и методы setТип(), getТип(), toString().
 * Определить дополнительно методы в классе, создающем массив объектов.
 * Задать критерий выбора данных и вывести эти данные на консоль.
 * В каждом классе, обладающем информацией, должно быть объявлено несколько конструкторов.
 * Book: id, Название, Автор(ы), Издательство, Год издания, Количество страниц, Цена, Тип переплета. Создать массив объектов. Вывести:
 * a) список книг заданного автора;
 * b) список книг, выпущенных заданным издательством;
 * c) список книг, выпущенных после заданного года.
 */
package chapter3.task1.book;

public class Book {

    private Long id;
    private String name;
    private String author;
    private String publishingHouse;
    private short publishingYear;
    private int countOfPages;
    private double cost;
    private String bindingType;

    public Book(String name, String author, String publishingHouse, short publishingYear) {
        this(0, name, author, publishingHouse, publishingYear, 0, 0, null);
    }

    public Book(long id, String name, String author, String publishingHouse, short publishingYear, int countOfPages, double cost, String bindingType) {
        if (name == null) {
            throw new RuntimeException("Name must not be null!");
        }
        if (author == null) {
            throw new RuntimeException("Author must not be null!");
        }
        if (publishingHouse == null) {
            throw new RuntimeException("Publishing House must not be null!");
        }
        if (publishingYear < 1990) {
            throw new RuntimeException("Publishing year must be more than 1990!");
        }
        this.id = id;
        this.name = name;
        this.author = author;
        this.publishingHouse = publishingHouse;
        this.publishingYear = publishingYear;
        this.countOfPages = countOfPages;
        this.cost = cost;
        this.bindingType = bindingType;
    }

    public Long getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public short getPublishingYear() {
        return publishingYear;
    }

    public int getCountOfPages() {
        return countOfPages;
    }

    public double getCost() {
        return cost;
    }

    public String getBindingType() {
        return bindingType;
    }

    @Override
    public String toString() {
        return "Book{" +
                "ID=" + id +
                ", name='" + name + '\'' +
                ", authors=" + author +
                ", publishingHouse='" + publishingHouse + '\'' +
                ", publishingYear=" + publishingYear +
                ", countOfPages=" + countOfPages +
                ", cost=" + cost +
                ", bindingType='" + bindingType + '\'' +
                '}';
    }
}
