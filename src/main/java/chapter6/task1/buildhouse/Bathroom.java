package chapter6.task1.buildhouse;

import chapter6.task1.Room;

public class Bathroom extends Room { // ванная комната

    FloorCeramicType floorCeramicType;

    public Bathroom(int length, int width) {
        super(length, width);
    }

    public Bathroom(int length, int width, FloorCeramicType floorCeramicType) {
        super(length, width);
        this.floorCeramicType = floorCeramicType;
    }

    @Override
    public String toString() {
        return " floor type - " + floorCeramicType + ".";
    }
}
