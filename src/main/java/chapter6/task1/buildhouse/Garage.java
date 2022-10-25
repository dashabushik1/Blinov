package chapter6.task1.buildhouse;

public class Garage { // гараж

    private int length;
    private int width;

    public Garage(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Garage";
    }
}
