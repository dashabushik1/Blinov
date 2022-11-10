package chapter4.task6;

public class Track {
    private String name; // наименование песни
    private double duration; // длительность песни
    private MusicStyles style; // стиль

    public Track(String name, double duration, MusicStyles style) {
        this.name = name;
        this.duration = duration;
        this.style = style;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "\nTrack: " + name + " |Duration: " + duration + " minutes " + " |Style: " + style;
    }
}
