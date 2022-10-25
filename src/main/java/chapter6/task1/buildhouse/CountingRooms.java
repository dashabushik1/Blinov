package chapter6.task1.buildhouse;

public class CountingRooms implements HouseBuilder { // класс для подчсета комнат в доме

    private int numBedrooms;
    private int numBathrooms;
    private boolean kitchenPresent;
    private boolean garagePresent;

    @Override
    public void addBedroom(int length, int width) {
        numBedrooms++;
    }

    @Override
    public void addBedroom(int length, int width, FloorCeramicType floorCeramicType) {
        numBedrooms++;
    }

    @Override
    public void addBathroom(int length, int width) {
        numBathrooms++;
    }

    @Override
    public void addBathroom(int length, int width, FloorCeramicType floorCeramicType) {
        numBathrooms++;
    }

    @Override
    public void garage(int length, int width) {
        garagePresent = true;
    }

    @Override
    public void kitchen(int length, int width, FloorCeramicType floorCeramicType) {
        kitchenPresent = true;
    }

    public int getNumBedrooms() {
        return numBedrooms;
    }

    public int getNumBathrooms() {
        return numBathrooms;
    }

    public boolean isKitchenPresent() {
        return kitchenPresent;
    }

    public boolean isGaragePresent() {
        return garagePresent;
    }
}

