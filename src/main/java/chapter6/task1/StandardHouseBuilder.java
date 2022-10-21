/**
 * 1. Разработать проект управления процессами на основе создания и реализации интерфейсов для следующей предметной области:
 * Дом. Возможности: построить дом; рассчитать цену за квадратный метр; узнать сколько комнат; увеличить площадь;
 * сдавать дом в аренду; сделать ремонт (в какой-либо комнате). Добавить специализированные методы для Дома, Офисного здания,
 * Торгового центра.
 */
package chapter6.task1;

import chapter6.task1.rooms.*;

public class StandardHouseBuilder implements HouseBuilder {

    private House house;

    public StandardHouseBuilder() {
        this.house = new House();
    }

    @Override
    public void buildBedroom(double length, double width, FloorType floorType, WallpaperType wallpaperType) {
        house.setBedroom(new Bedroom(length, width, floorType, wallpaperType));
    }

    @Override
    public void buildBathroom(double length, double width, FloorType floorType, WallpaperType wallpaperType) {
        house.setBathroom(new Bathroom(length, width, floorType, wallpaperType));
    }

    @Override
    public void buildKitchen(double length, double width, FloorType floorType, WallpaperType wallpaperType) {
        house.setKitchen(new Kitchen(length, width, floorType, wallpaperType));
    }

    @Override
    public void buildGarage(double length, double width, FloorType floorType, WallpaperType wallpaperType) {
        house.setGarage(new Garage(length, width, floorType, wallpaperType));
    }

    public House getHouse() {
        return house;
    }
}
