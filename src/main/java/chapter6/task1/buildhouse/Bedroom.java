package chapter6.task1.buildhouse;

import chapter6.task1.Room;

public class Bedroom extends Room { // спальня

    private FloorCeramicType floorCeramicType;

    public Bedroom(int length, int width) {
        super(length, width);
    }

    public Bedroom(int length, int width, FloorCeramicType floorCeramicType) {
        super(length, width);
        this.floorCeramicType = floorCeramicType;
    }

    @Override
    public String toString() {
        return " floor type - " + floorCeramicType + ".";
    }
}