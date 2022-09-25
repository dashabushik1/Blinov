package chapter4.task2;

public class Ram extends Device {  // оперативная память
    private int frequency; // частота
    private String latency;  // латентность

    public Ram() {
        this.capacity = capacity;
        this.frequency = frequency;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public String getLatency() {
        return latency;
    }

    public void setLatency(String latency) {
        this.latency = latency;
    }
}
