package chapter4.task2;

public class Hdd extends Device {  // винчестер, жесткий диск

    public String capacity;

    public Hdd(String capacity) {
        super("Seagate");
        this.capacity = capacity;
    }

    public String getCapacity() {
        return capacity;
    }
}
