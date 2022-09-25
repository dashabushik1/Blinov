package chapter4.task5;

import chapter4.task5.vegetables.Vegetable;

import java.util.Comparator;

public class Salad {

    private Vegetable[] ingredients;
    private int currentIndex = 0;
    private final static int DEFAULT_CAPACITY = 10;

    public Salad(int saladCapacity) {
        this.ingredients = new Vegetable[saladCapacity];
    }

    public Salad() {
        this(DEFAULT_CAPACITY);
    }

    public Vegetable[] getIngredients() {
        return ingredients;
    }

    public int getOverallCalorificValue() {  // метод возвращает общее количество калорий в этом салате
        int total = 0;
        for (Vegetable vegetable : ingredients) {
            if (vegetable == null)
                break;
            total += vegetable.getCalorificValue();
        }
        return total;
    }

    public boolean addIngredient(Vegetable ingredient) { // метод добавляет ингредиент в салат, возвращает true в случае успеха.
        if (currentIndex < ingredients.length) {        //  и false, если салат готов
            ingredients[currentIndex] = ingredient;
            currentIndex++;
            return true;
        } else
            return false;
    }

    public boolean removeIngredient() {  // метод удаляет ингредиент из салата, возвращает true в случае успеха
        if (currentIndex >= 0) {         // и false если салат пустой
            ingredients[currentIndex] = null;
            currentIndex--;
            return true;
        } else
            return false;
    }

    public Vegetable getIngredient(int fromCalorificValue, int toCalorificValue) {  // Возвращает первый найденный ингредиент
        for (Vegetable vegetable : ingredients) {
            if (vegetable == null)
                break;
            if (vegetable.getCalorificValue() >= fromCalorificValue
                    && vegetable.getCalorificValue() <= toCalorificValue) {
                return vegetable;
            }
        }
        return null;
    }

    public void sortIngredients() {   // Сортирует салат по весу ингредиентов по возрастанию
        for (int i = 0; i < currentIndex; i++) {
            int minIndex = i;
            for (int j = i; j < currentIndex; j++) {
                if (ingredients[j].getWeight() < ingredients[minIndex].getWeight()) {
                    minIndex = j;
                }
            }
            Vegetable temp = ingredients[i];
            ingredients[i] = ingredients[minIndex];
            ingredients[minIndex] = temp;
        }
    }

    public void sortIngredients(Comparator<Vegetable> comp) {  // Сортирует этот салат в соответствии с порядком
        for (int i = 0; i < currentIndex; i++) {
            int minIndex = i;
            for (int j = i; j < currentIndex; j++) {
                if (comp.compare(ingredients[j], ingredients[minIndex]) > 0) {
                    minIndex = j;
                }
            }
            Vegetable temp = ingredients[i];
            ingredients[i] = ingredients[minIndex];
            ingredients[minIndex] = temp;
        }
    }
}
