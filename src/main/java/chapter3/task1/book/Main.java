package chapter3.task1.book;

public class Main {

    public static void main(String[] args) {

        Book[] books = new Book[]{
                new Book(1L, "Memories", "Konstantin Alekseevich Korovin", "Zakharov",
                        (short) 2020, 576, 35, "Hard cover"),
                new Book(2L, "Kingdom of Crooked Mirrors", "Vitaly Gubarev", "Samovar",
                        (short) 1990, 126, 20, "Hard cover"),
                new Book(3L, "The New Adventures of Sherlock Holmes", "A. Conan Doyle", "Prometheus",
                        (short) 1990, 421, 55, "Hard Cover"),
                new Book(4L, "Lady blizzard", "Grimm V.", "Book House", (
                        short) 2009, 8, 3, "Soft cover"),
                new Book(5L, "Tales of the Brothers Grimm", "Grimm V.", "Olympia",
                        (short) 2007, 952, 200, "Hard cover"),
                new Book(6L, "Tale of a brave hare", "Mamin-Sibiryak D.", "Book House",
                        (short) 2009, 8, 2.5, "Soft cover"),
        };

        Book[] booksByAuthor = findBooksByAuthor(books, "Grimm V.");
        System.out.println("Books by Grimm V.: ");
        for (int i = 0; i < booksByAuthor.length; i++) {
            System.out.println(booksByAuthor[i].getName() + " ");
        }

        Book[] booksByPublishingHouse = findBooksByPublishingHouse(books, "Book House");
        System.out.println("\nBooks by Book House: ");
        for (int i = 0; i < booksByPublishingHouse.length; i++) {
            System.out.println(booksByPublishingHouse[i].getName() + " ");
        }

        Book[] booksPublishedAfter = findPublishedBooksAfter(books, (short) 2005);
        System.out.println("\nBooks published after 2005: ");
        for (Book book : booksPublishedAfter) {
            System.out.println(book.getName());
        }
    }

    private static Book[] findBooksByAuthor(Book[] books, String author) {
        Book[] booksByAuthor = new Book[books.length];
        int bookIndex = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i].getAuthor().equals(author)) {
                booksByAuthor[bookIndex] = books[i];
                bookIndex++;
            }
        }
        Book[] actualBooksByAuthor = new Book[bookIndex];
        for (int i = 0; i < bookIndex; i++) {
            if (booksByAuthor[i] != null) {
                actualBooksByAuthor[i] = booksByAuthor[i];
            }
        }
        return actualBooksByAuthor;
    }

    private static Book[] findBooksByPublishingHouse(Book[] books, String publishingHouse) {
        Book[] booksByPublishingHouse = new Book[books.length];
        int bookIndex = 0;
        for (int i = 0; i < books.length; ++i) {
            if (books[i].getPublishingHouse().equals(publishingHouse)) {
                booksByPublishingHouse[bookIndex] = books[i];
                bookIndex++;
            }
        }
        Book[] actualBooksByPublishingHouse = new Book[bookIndex];
        for (int i = 0; i < bookIndex; ++i) {
            if (booksByPublishingHouse[i] != null) {
                actualBooksByPublishingHouse[i] = booksByPublishingHouse[i];
            }
        }
        return actualBooksByPublishingHouse;
    }

    private static Book[] findPublishedBooksAfter(Book[] books, short year) {
        Book[] booksPublishedAfter = new Book[books.length];
        int bookIndex = 0;
        for (int i = 0; i < books.length; ++i) {
            if (books[i].getPublishingYear() >= year) {
                booksPublishedAfter[bookIndex] = books[i];
                bookIndex++;
            }
        }
        Book[] actualPublishedBooksAfter = new Book[bookIndex];
        for (int i = 0; i < bookIndex; ++i) {
            if (booksPublishedAfter[i] != null) {
                actualPublishedBooksAfter[i] = booksPublishedAfter[i];
            }
        }
        return actualPublishedBooksAfter;
    }
}