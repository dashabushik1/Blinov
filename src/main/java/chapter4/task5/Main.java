/**
 * 5. Создать консольное приложение, удовлетворяющее следующим требованиям:
 * • Использовать возможности ООП: классы, наследование, полиморфизм, инкапсуляция.
 * • Каждый класс должен иметь отражающее смысл название и информативный состав.
 * • Наследование должно применяться только тогда, когда это имеет смысл.
 * • При кодировании должны быть использованы соглашения об оформлении кода java code convention.
 * • Классы должны быть грамотно разложены по пакетам.
 * • Консольное меню должно быть минимальным.
 * • Для хранения параметров инициализации можно использовать файлы.
 * <p>
 * Шеф-повар. Определить иерархию овощей. Сделать салат. Подсчитать калорийность.
 * Провести сортировку овощей для салата на основе одного из параметров.
 * Найти овощи в салате, соответствующие заданному диапазону калорийности.
 */

package chapter4.task5;

import chapter4.task5.vegetables.*;

public class Main {

    public static void main(String[] args) {

        Salad randomSalad = initialize();  // Создаем экземпляр овощного салата

        System.out.println("Overall salad calorific value - " + randomSalad.getOverallCalorificValue());
        System.out.println("----------------------------------");  // Рассчитываем общую калорийность нашего салата

        randomSalad.sortIngredients();      // Сортируем овощи по весу
        for (Vegetable ingredient : randomSalad.getIngredients()) {
            if (ingredient == null)
                break;
            System.out.println(ingredient);
        }
        System.out.println("----------------------------------");

        System.out.println(randomSalad.getIngredient(10, 40)); // Ищем в нашем салате овощ с калорийностью из выбранного диапазона
    }

    private static Salad initialize() {  // Возвращает простой экземпляр Salad со случайно взвешенными овощами
        Salad salad = new Salad();
        salad.addIngredient(new Cabbage((int) (Math.random() * 100 + 20), 20));
        salad.addIngredient(new Carrot((int) (Math.random() * 100 + 20), "Red", "Oval"));
        salad.addIngredient(new Cucumber((int) (Math.random() * 100 + 20), 300, "Sharp"));
        salad.addIngredient(new Pease((int) (Math.random() * 100 + 20), 8, 20));
        salad.addIngredient(new Potato((int) (Math.random() * 100 + 20), false));
        salad.addIngredient(new Radish((int) (Math.random() * 100 + 20), true, "White"));
        salad.addIngredient(new Tomato((int) (Math.random() * 100 + 20), "Hurma", "Red"));
        return salad;
    }
}