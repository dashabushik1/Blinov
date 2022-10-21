package chapter6.task1;

public class Main {

    public static void main(String[] args) {

        HouseBuilder builder = new StandardHouseBuilder();
        OneBedroomHouse houseBuildingCompany = new OneBedroomHouse();
        House house = houseBuildingCompany.constructHouse(builder);
        System.out.println(house.toString());
    }
}

