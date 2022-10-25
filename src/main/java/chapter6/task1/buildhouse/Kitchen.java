package chapter6.task1.buildhouse;

import chapter6.task1.Room;

public class Kitchen extends Room { // кухня

    private FloorCeramicType floorCeramicType;

    public Kitchen(int length, int width) {
        super(length, width);
    }

    public Kitchen(int length, int width, FloorCeramicType floorCeramicType) {
        super(length, width);
        this.floorCeramicType = floorCeramicType;
    }

    @Override
    public String toString() {
        return " floor type - " + floorCeramicType + ".";
    }
}
