package chapter4.task5.comparators;

import chapter4.task5.ingredients.Ingredient;

import java.util.Comparator;

public class WeightComparator implements Comparator<Ingredient> {
    public int compare(Ingredient v1, Ingredient v2) {
        return (int) (v1.getWeight() - v2.getWeight());
    }
}