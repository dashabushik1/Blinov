package chapter6.task1.buildhouse.rooms;

import chapter6.task1.FloorCeramicType;
import chapter6.task1.Room;

public class Bathroom extends Room { // ванная комната

    private FloorCeramicType floorCeramicType;
    private Repair repair;

    public Bathroom(int length, int width, Repair repair) {
        super(length, width);
        this.repair = repair;
    }

    public Bathroom(int length, int width, FloorCeramicType floorCeramicType, Repair repair) {
        super(length, width);
        this.floorCeramicType = floorCeramicType;
        this.repair = repair;
    }

    @Override
    public String toString() {
        return " floor type - " + floorCeramicType + " repair" + repair;
    }
}
