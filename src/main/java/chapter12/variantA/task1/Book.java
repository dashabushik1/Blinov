package chapter12.variantA.task1;

class Book {
    private final long id;
    private final boolean readingRoomOnly;

    Book(long id, boolean readingRoomOnly) {
        this.id = id;
        this.readingRoomOnly = readingRoomOnly;
    }

    long getId() {
        return id;
    }

    boolean isReadingRoomOnly() {
        return readingRoomOnly;
    }
}