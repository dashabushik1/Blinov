/**
 * 1. Разработать проект управления процессами на основе создания и реализации интерфейсов для:
 * Дом. Возможности: построить дом; рассчитать цену за квадратный метр; узнать сколько комнат; увеличить площадь;
 * сдавать дом в аренду. Добавить специализированные методы для Дома, Офисного здания, Торгового центра.
 */
package chapter6.task1;

import chapter6.task1.buildhouse.CountingRooms;
import chapter6.task1.buildhouse.TwoBedroomHouse;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        CountingRooms countingRooms = new CountingRooms();
        TwoBedroomHouse house = new TwoBedroomHouse(countingRooms);

        house.constructHouse();
        System.out.println("Enter the cost of the house: ");
        int costOfHouse = scanner.nextInt(); // стоимость всего дома
        System.out.println("Enter the house area: ");
        double houseArea = scanner.nextDouble(); // площадь дома в квадратных метрах
        System.out.println("Price for 1 square meter is $" + house.getCostPerSquareMeter(costOfHouse, houseArea) + ".");


        System.out.println("-----------------------------");
        System.out.println("Number of bedrooms : " + countingRooms.getNumBedrooms() + ".");
        System.out.println("Number of bathrooms : " + countingRooms.getNumBathrooms() + ".");
        System.out.println("Is Kitchen present: " + countingRooms.isKitchenPresent() + ".");
        System.out.println("Is Garage present: " + countingRooms.isGaragePresent() + ".");


        System.out.println("-----------------------------");
        System.out.println("How much do you want to increase the area of the house?");
        double increaseArea = scanner.nextDouble();
        System.out.println("The area is increased by " + increaseArea + " and now it is " +
                house.increaseTheArea(increaseArea, houseArea) + " square meters.");

        System.out.println("-----------------------------");
        System.out.println("House rent per month is $" + house.rentAHouse() + ".");


    }
}

