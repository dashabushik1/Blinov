/**
 * 1. Разработать проект управления процессами на основе создания и реализации интерфейсов для:
 * Дом. Возможности: построить дом; рассчитать цену за квадратный метр; узнать сколько комнат; увеличить площадь;
 * сдавать дом в аренду, сделать ремонт (в какой-либо комнате). Добавить специализированные методы для Дома, Офисного здания,
 * Торгового центра.
 */
package chapter6.task1;

import chapter6.task1.buildhouse.HBuilder;
import chapter6.task1.buildhouse.House;
import chapter6.task1.buildhouse.TwoBedroomHouse;

public class Main {

    public static void main(String[] args) {

        HBuilder builder = new HBuilder();
        TwoBedroomHouse twoBedroomHouse = new TwoBedroomHouse(builder);
        System.out.println(twoBedroomHouse.getAllHouseArea());


//        System.out.println("Enter the cost of the house: ");
//        System.out.println("Enter the house area: ");
//        System.out.println("Price for 1 square meter is $" + house.getCostPerSquareMeter(costOfHouse, houseArea) + ".");


//        System.out.println("-----------------------------");
//        System.out.println("How much do you want to increase the area of the house?");
//        System.out.println("The area is increased by " + increaseArea + " and now it is " +
//                house.increaseTheArea(increaseArea, houseArea) + " square meters.");

//
//        int bedrooms = countingRooms.getNumBedrooms();
//        int bathrooms = countingRooms.getNumBathrooms();
//        System.out.println("-----------------------------");
//        System.out.println("House rent per month is $" + house.rentAHouse(bedrooms, bathrooms) + ".");

    }
}

