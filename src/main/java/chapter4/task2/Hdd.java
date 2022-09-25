package chapter4.task2;

public class Hdd extends Device {  // винчестер
    private String dimension;  // измерение
    private String spindleSpeed; // скорость вращения шпинделя
    private int randomAccessTime; // случайное время доступа

    public Hdd(String type, String manufacturer, String capacity) {
        this.type = type;
        this.manufacturer = manufacturer;
        this.capacity = capacity;
    }

    public void printCapacity() {
        System.out.println("The capacity of HDD is " + this.capacity);
    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    public String getSpindleSpeed() {
        return spindleSpeed;
    }

    public void setSpindleSpeed(String spindleSpeed) {
        this.spindleSpeed = spindleSpeed;
    }

    public int getRandomAccessTime() {
        return randomAccessTime;
    }

    public void setRandomAccessTime(int randomAccessTime) {
        this.randomAccessTime = randomAccessTime;
    }
}
