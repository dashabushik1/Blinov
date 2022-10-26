package chapter6.task1.buildhouse;

import chapter6.task1.FloorCeramicType;
import chapter6.task1.Room;
import chapter6.task1.buildhouse.rooms.*;

import java.util.List;

public class HBuilder implements HouseBuilder {

    public List<Room> rooms;
    House house;

    @Override
    public void addBedroom(int length, int width, Repair repair) {
        Bedroom bedroom = new Bedroom(length, width, repair);
        rooms.add(bedroom);
    }

    @Override
    public void addBedroom(int length, int width, FloorCeramicType floorCeramicType, Repair repair) {
        Bedroom bedroom = new Bedroom(length, width, floorCeramicType, repair);
        rooms.add(bedroom);
    }

    @Override
    public void addBathroom(int length, int width, Repair repair) {
        Bathroom bathroom = new Bathroom(length, width, repair);
        rooms.add(bathroom);
    }

    @Override
    public void addBathroom(int length, int width, FloorCeramicType floorCeramicType, Repair repair) {
        Bathroom bathroom = new Bathroom(length, width, floorCeramicType, repair);
        rooms.add(bathroom);
    }

    @Override
    public void addKitchen(int length, int width, FloorCeramicType floorCeramicType, Repair repair) {
        Kitchen kitchen = new Kitchen(length, width, floorCeramicType, repair);
        rooms.add(kitchen);
    }

    @Override
    public House buildHouse() {
        return house;
    }
}
