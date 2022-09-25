package chapter4.task2;


public class Processor extends Device { // процессор
    private int numberOfCores;  // количество ядер
    private int frequency;  // частота
    private int cacheMemory; // кэш-память
    private String socket;  // разъем

    public Processor(String manufacturer, int numberOfCores) {
        this.manufacturer = manufacturer;
        this.numberOfCores = numberOfCores;
    }

    public int getNumberOfCores() {
        return numberOfCores;
    }

    public void setNumberOfCores(int numberOgCores) {
        this.numberOfCores = numberOfCores;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public int getCacheMemory() {
        return cacheMemory;
    }

    public void setCacheMemory(int cacheMemory) {
        this.cacheMemory = cacheMemory;
    }

    public String getSocket() {
        return socket;
    }

    public void setSocket(String socket) {
        this.socket = socket;
    }
}
