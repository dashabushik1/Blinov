package chapter6.task1;

import chapter6.task1.rooms.FloorType;
import chapter6.task1.rooms.WallpaperType;

public interface HouseBuilder { // интерфейс для строительства различных частей здания или дома

    void buildBedroom(double length, double width, FloorType floorType, WallpaperType wallpaperType);

    void buildBathroom(double length, double width, FloorType floorType, WallpaperType wallpaperType);

    void buildKitchen(double length, double width, FloorType floorType, WallpaperType wallpaperType);

    void buildGarage(double length, double width, FloorType floorType, WallpaperType wallpaperType);

    House getHouse();
}
