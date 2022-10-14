package chapter4.task5.comparators;

import chapter4.task5.ingredients.Ingredient;

import java.util.Comparator;

public class CaloriesComparator implements Comparator<Ingredient> {
    public int compare(Ingredient v1, Ingredient v2) {
        return (int) (v1.getTotalCalories() - v2.getTotalCalories());
    }
}