package chapter4.task3;

import java.util.ArrayList;
import java.util.List;

public class Planet {
    private String name;

    private List<Ocean> oceans = new ArrayList<>();
    private List<Continent> continents = new ArrayList<>();
    private List<Island> islands = new ArrayList<>();

    public Planet(String name) {
        this.name = name;
    }

    public void addOcean(Ocean ocean) {
        oceans.add(ocean);
    }

    public void addContinent(Continent continent) {
        continents.add(continent);
    }

    public String getName() {
        return name;
    }

    public List<Continent> getContinents() {
        return continents;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", oceanList=" + oceans +
                ", continentList=" + continents +
                ", islandList=" + islands +
                '}';
    }
}
