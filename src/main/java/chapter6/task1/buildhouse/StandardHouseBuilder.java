package chapter6.task1.buildhouse;

public class StandardHouseBuilder implements HouseBuilder { // реализауия интерфейса HouseBuilder

    private House house = new House();

    @Override
    public void addBedroom(int length, int width) {
        Bedroom bedroom = new Bedroom(length, width);
        house.addBedroom(bedroom);
    }

    @Override
    public void addBedroom(int length, int width, FloorCeramicType floorCeramicType) {
        Bedroom bedroom = new Bedroom(length, width, floorCeramicType);
        house.addBedroom(bedroom);
    }

    @Override
    public void addBathroom(int length, int width) {
        Bathroom bathroom = new Bathroom(length, width);
        house.addBathroom(bathroom);
    }

    @Override
    public void addBathroom(int length, int width, FloorCeramicType floorCeramicType) {
        Bathroom bathroom = new Bathroom(length, width, floorCeramicType);
        house.addBathroom(bathroom);
    }

    @Override
    public void garage(int length, int width) {
        Garage garage = new Garage(length, width);
        house.setGarage(garage);
    }

    @Override
    public void kitchen(int length, int width, FloorCeramicType floorCeramicType) {
        Kitchen kitchen = new Kitchen(length, width, floorCeramicType);
        house.setKitchen(kitchen);
    }
}
