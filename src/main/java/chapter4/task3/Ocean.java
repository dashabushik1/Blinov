package chapter4.task3;

public class Ocean {
    private String name;

    public Ocean(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Ocean{" +
                "name='" + name + '\'' +
                '}';
    }
}
