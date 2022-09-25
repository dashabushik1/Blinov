package chapter4.task3;

public class Island {
    private String name;

    public Island(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Island{" +
                "name='" + name + '\'' +
                '}';
    }
}
