package chapter6.task1.buildhouse;

import static chapter6.task1.buildhouse.FloorCeramicType.*;

public class TwoBedroomHouse implements HouseFacilities {

    private HouseBuilder houseBuilder;
    private CountingRooms countingRooms = new CountingRooms();
    private double totalArea; // как найти?

    int bedrooms = countingRooms.getNumBedrooms(); // пишет 0
    int bathrooms = countingRooms.getNumBathrooms();

    public TwoBedroomHouse(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public void constructHouse() { // метод строит дом
        houseBuilder.addBedroom(100, 100);
        houseBuilder.addBedroom(120, 120, GRANITE);
        houseBuilder.addBathroom(40, 50);
        houseBuilder.addBathroom(40, 40, MOSAIC);
        houseBuilder.kitchen(120, 80, MARBLE);
        houseBuilder.garage(60, 60);
    }

    @Override
    public double getCostPerSquareMeter(int cost, double houseArea) {
        int costPerSquareMeter = (int) (cost / houseArea);
        return costPerSquareMeter;
    }

    @Override
    public double increaseTheArea(double increase, double houseArea) {
        double newArea = increase + houseArea;
        return newArea;
    }

    @Override
    public int rentAHouse() {  // todo не работает!!!!!!!
        int rent = 1000;
        if (bedrooms > 2) {  // добавляет 200 долларов за каждую спальню больше 2
            rent += 200 * (bedrooms - 2);
        }
        if (bathrooms >= 1) { // добавляет 100 долларов за каждую ванную больше 1.
            rent += 100 * (bathrooms - 1);
        }
        return rent;
    }
}
