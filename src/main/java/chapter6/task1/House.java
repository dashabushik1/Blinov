package chapter6.task1;

import chapter6.task1.rooms.*;

public class House {

    private Bedroom bedroom;
    private Bathroom bathroom;
    private Kitchen kitchen;
    private Garage garage;

    public void setBedroom(Bedroom bedroom) {
        this.bedroom = bedroom;
    }

    public void setBathroom(Bathroom bathroom) {
        this.bathroom = bathroom;
    }

    public void setKitchen(Kitchen kitchen) {
        this.kitchen = kitchen;
    }

    public void setGarage(Garage garage) {
        this.garage = garage;
    }

    @Override
    public String toString() {
        return "House consist of: " + "\nbedroom: " + bedroom + ", \nbathroom: " + bathroom + ", \nkitchen: " + kitchen +
                ", \ngarage: " + garage + ".";
    }
}
