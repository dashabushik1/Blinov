package chapter6.task1.buildhouse;

public interface HouseFacilities { // интерфейс для возможностей дома

//    double getAllHouseArea();  хочу добавить

    double getCostPerSquareMeter(int cost, double houseArea);

    double increaseTheArea(double increase, double houseArea);

    int rentAHouse();

//    void showData(); хочу добавить

}