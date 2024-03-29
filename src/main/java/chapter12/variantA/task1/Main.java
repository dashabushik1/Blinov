/**
 * 1. Разработать многопоточное приложение. Использовать возможности, предоставляемые пакетом java.util.concurrent.
 * Не использовать слово synchronized. Все сущности, желающие получить доступ к ресурсу, должны быть потоками.
 * Маленькая библиотека. Доступны для чтения несколько книг. Одинаковых книг в библиотеке нет.
 * Некоторые выдаются на руки, некоторые только в читальный зал.
 * Читатель может брать на руки и в читальный зал несколько книг.
 */
package chapter12.variantA.task1;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        ArrayList<Book> books = createBooks();
        Library library = new Library();
        ReadingRoom readingRoom = new ReadingRoom();
        library.setBooks(books);

        Thread reader1 = new Thread(new Reader(library, readingRoom, "A"), "reader1");
        Thread reader2 = new Thread(new Reader(library, readingRoom, "B"), "reader2");
        Thread reader3 = new Thread(new Reader(library, readingRoom, "C"), "reader3");
        Thread reader4 = new Thread(new Reader(library, readingRoom, "D"), "reader4");

        reader1.start();
        reader2.start();
        reader3.start();
        reader4.start();
    }

    private static ArrayList<Book> createBooks() {
        ArrayList<Book> books = new ArrayList<>();
        for (int i = 1; i < 20; i++) {
            Book book = new Book(i, new Random().nextBoolean());
            books.add(book);
        }
        return books;
    }
}