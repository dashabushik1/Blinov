package chapter3.variantA.book;

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
        print(booksByAuthor);

        Book[] booksByPublishingHouse = findBooksByPublishingHouse(books, "Book House");
        System.out.println("\nBooks by Book House: ");
        print(booksByPublishingHouse);

        Book[] booksPublishedAfter = findPublishedBooksAfter(books, (short) 2005);
        System.out.println("\nBooks published after 2005: ");
        print(booksPublishedAfter);
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
        booksByAuthor = trim(booksByAuthor, bookIndex);
        return booksByAuthor;
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
        booksByPublishingHouse = trim(booksByPublishingHouse, bookIndex);
        return booksByPublishingHouse;
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
        booksPublishedAfter = trim(booksPublishedAfter, bookIndex);
        return booksPublishedAfter;
    }

    private static Book[] trim(Book[] books, int b) {
        Book[] result = new Book[b];
        int j = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                result[j] = books[i];
                j++;
            }
        }
        return result;
    }

    private static void print(Book[] books) {
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getName() + " ");
        }
    }
}