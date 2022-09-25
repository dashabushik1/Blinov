package chapter4.task2;

public class CdRom extends Device { // дисковод
    private String dimension; // измерение
    private int speedOfReading; // скорость чтения


    public CdRom() {
        this.type = type;
        this.speedOfReading = speedOfReading;
    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    public int getSpeedOfReading() {
        return speedOfReading;
    }

    public void setSpeedOfReading(int speedOfReading) {
        this.speedOfReading = speedOfReading;
    }
}
