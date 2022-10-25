package chapter6.task1.buildhouse;

public interface HouseBuilder { // интерфейс для строительства дома

    void addBedroom(int length, int width);

    void addBedroom(int length, int width, FloorCeramicType floorCeramicType);

    void addBathroom(int length, int width);

    void addBathroom(int length, int width, FloorCeramicType floorCeramicType);

    void garage(int length, int width);

    void kitchen(int length, int width, FloorCeramicType floorCeramicType);

}
