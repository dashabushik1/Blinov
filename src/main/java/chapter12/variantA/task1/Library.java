package chapter12.variantA.task1;

import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;

public class Library implements Room {
    ReentrantLock lock = new ReentrantLock();
    private int readersInRoom = 0;
    private ArrayList<Book> books;

    public void enter(Reader reader) {
        lock.lock();
        int maxReadersInRoom = 2;
        while (readersInRoom >= maxReadersInRoom) {
            try {
                wait();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
        readersInRoom++;
        reader.setLocation("library");
        System.out.println("Reader " + reader.getName() + " entered to library");
        System.out.println("Readers in library room: " + readersInRoom);
    }

    public void leave(Reader reader) {
        lock.lock();
        int minReadersInRoom = 0;
        while (readersInRoom <= minReadersInRoom) {
            try {
                wait();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
        readersInRoom--;
        reader.setLocation("building");
        System.out.println("Reader " + reader.getName() + " leaved library");
        System.out.println("Readers in library room: " + readersInRoom);
        notify();
    }


    void giveBook(Reader reader, Book book) {
        lock.lock();
        ArrayList<Book> readerBooks = reader.getBooks();
        readerBooks.add(book);
        reader.setBooks(readerBooks);
        books.remove(book);
        System.out.println("Reader " + reader.getName() + " has token the book "
                + book.getId());
    }

    void returnBook(Reader reader, Book book) {
        lock.lock();
        ArrayList<Book> readerBooks = reader.getBooks();
        readerBooks.remove(book);
        reader.setBooks(readerBooks);
        books.add(book);
        System.out.println("Reader " + reader.getName() + " has returned the book "
                + book.getId());
    }

    ArrayList<Book> getBooks() {
        return books;
    }

    void setBooks(ArrayList<Book> books) {
        this.books = books;
    }
}