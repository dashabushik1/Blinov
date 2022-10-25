package chapter6.task1;

public class Room {
    private int length;
    private int width;

    public Room(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public String toString() {
        return "Room{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
