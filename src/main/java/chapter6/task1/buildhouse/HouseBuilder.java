package chapter6.task1.buildhouse;

import chapter6.task1.FloorCeramicType;
import chapter6.task1.buildhouse.rooms.Repair;

public interface HouseBuilder {

    void addBedroom(int length, int width, Repair repair);

    void addBedroom(int length, int width, FloorCeramicType floorCeramicType, Repair repair);

    void addBathroom(int length, int width, Repair repair);

    void addBathroom(int length, int width, FloorCeramicType floorCeramicType, Repair repair);

    void addKitchen(int length, int width, FloorCeramicType floorCeramicType, Repair repair);

    House buildHouse();

}
