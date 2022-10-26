package chapter6.task1.buildhouse;

import chapter6.task1.FloorCeramicType;
import chapter6.task1.Room;
import chapter6.task1.buildhouse.rooms.Repair;

import java.util.ArrayList;
import java.util.List;

import static chapter6.task1.FloorCeramicType.*;
import static chapter6.task1.buildhouse.rooms.Repair.*;

public class TwoBedroomHouse implements HouseFacilities {

    private HBuilder houseBuilder;

    public TwoBedroomHouse(HBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public void constructHouse() { // метод строит дом
        houseBuilder.addBedroom(100, 100, COSMETIC);
        houseBuilder.addBedroom(120, 120, GRANITE, RENOVATION);
        houseBuilder.addBathroom(40, 50, COSMETIC);
        houseBuilder.addBathroom(40, 40, MOSAIC, DESIGNER);
        houseBuilder.addKitchen(120, 80, MARBLE, DESIGNER);
    }

    List<Room> rooms = houseBuilder.rooms;

    public double getAllHouseArea() {
        double roomArea = 0;
        for (Room room : rooms) {
            roomArea = room.getLength() * room.getWidth();
        }
        return roomArea;
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
    public int rentAHouse(int bedrooms, int bathrooms) { // метод
        int rent = 1000;
        if (bedrooms > 1) {  // добавляет 200 долларов за каждую спальню больше 1
            rent += 200 * 1;
        }
        if (bathrooms > 1) { // добавляет 100 долларов за каждую ванную больше 1
            rent += 100 * 1;
        }
        return rent;
    }
}
