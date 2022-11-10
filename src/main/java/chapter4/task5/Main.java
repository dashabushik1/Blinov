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

import chapter4.task5.ingredients.CrispСroutons;
import chapter4.task5.ingredients.Dressing;
import chapter4.task5.ingredients.ParmesanCheese;
import chapter4.task5.ingredients.RomaineLettuce;

public class Main {

    public static void main(String[] args) {

        Salad cesarSalad = mixSalad();  // Создаем экземпляр овощного салата

        System.out.println("Overall salad calorific value - " + cesarSalad.countCalories());  // Рассчитываем общую калорийность нашего салата
        System.out.println("----------------------------------");

        cesarSalad.showRecipe();
        System.out.println("----------------------------------");

        cesarSalad.sortIngredientsByCalories();
        System.out.println("----------------------------------");

        cesarSalad.sortIngredientsByWeight();
        System.out.println("----------------------------------");

        cesarSalad.findIngredientsByCalories(300, 500);
    }

    private static Salad mixSalad() {  // Возвращает простой экземпляр Salad со случайно взвешенными ингредиентами
        Salad salad = new Salad();
        salad.addIngredients(new CrispСroutons(30));
        salad.addIngredients(new Dressing(30));
        salad.addIngredients(new ParmesanCheese(15));
        salad.addIngredients(new RomaineLettuce(200));
        return salad;
    }
}