package chapter5.task4;

import java.util.ArrayList;
import java.util.List;

public class Park {

    private List<Attraction> attractions = new ArrayList<>();

    public Park() {
    }

    public void addAttraction(String typeOfAttraction, String attractionOpeningHours, double cost) {
        attractions.add(new Attraction(typeOfAttraction, attractionOpeningHours, cost));
    }

    @Override
    public String toString() {
        return "Attractions: " + attractions + ".";
    }

    class Attraction {
        private String typeOfAttraction; // тип аттракциона
        private String attractionOpeningHours; // рабочие часы аттракциона
        private double cost; // стоимость за раз катания

        public Attraction(String typeOfAttraction, String attractionOpeningHours, double cost) {
            this.typeOfAttraction = typeOfAttraction;
            this.attractionOpeningHours = attractionOpeningHours;
            this.cost = cost;
        }

        @Override
        public String toString() {
            return "\n|Name of attraction: " + typeOfAttraction + " |cost: " + cost +
                    " |opening hours: " + attractionOpeningHours;
        }
    }
}
