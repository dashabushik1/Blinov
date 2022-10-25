package chapter6.task1.buildhouse;

import java.util.List;

public class House {

    private List<Bathroom> bathrooms;
    private List<Bedroom> bedrooms;
    private Kitchen kitchen;
    private Garage garage;

    public House() {
    }

    public void addBedroom(Bedroom bedroom) {
        this.bedrooms.add(bedroom);
    }

    public void addBathroom(Bathroom bathroom) {
        this.bathrooms.add(bathroom);
    }

    public void setKitchen(Kitchen kitchen) {
        this.kitchen = kitchen;
    }

    public void setGarage(Garage garage) {
        this.garage = garage;
    }

    @Override
    public String toString() {
        return "House was built!" + "\nBathroom(s):" + bathrooms + "\nBedroom(s):" + bedrooms +
                "\nKitchen:" + kitchen + "\nGarage: " + garage;
    }
}
