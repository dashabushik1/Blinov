package chapter4.task5;

import chapter4.task5.comparators.CaloriesComparator;
import chapter4.task5.comparators.WeightComparator;
import chapter4.task5.ingredients.Ingredient;

import java.util.*;

public class Salad {

    private String name; // название салата
    private List<Ingredient> ingredients = new ArrayList<>(); // иргредиенты салата

    public Salad() {
        name = "Cesar";
    }

    public void addIngredients(Ingredient ingredient) {
        ingredients.add(ingredient);
    }

    public void showRecipe() {
        if (name.equals("Cesar")) {
            System.out.println("The salad " + name + " contains:");
        }
        for (Ingredient ingredient : ingredients) {
            System.out.println(ingredient);
        }
    }

    public double countCalories() {
        double calories = 0.0;
        for (Ingredient ingredient : ingredients) {
            calories += ingredient.getTotalCalories();
        }
        return calories;
    }

    public void sortIngredientsByCalories() {  // метод сортирует ингредиенты (по калориям) по возрастанию
        Collections.sort(ingredients, new CaloriesComparator());
        System.out.println("Sorted ingredients by calories: ");
        for (Ingredient ingredient : ingredients) {
            System.out.println(ingredient.getNameOfIngredient() + " - " + ingredient.getTotalCalories() + " kcal.");
        }
    }

    public void sortIngredientsByWeight() { // метод сортирует ингредиенты (по весу) по возрастанию
        Collections.sort(ingredients, new WeightComparator());
        System.out.println("Sorted ingredients by weight: ");
        for (Ingredient ingredient : ingredients) {
            System.out.println(ingredient.getNameOfIngredient() + " - " + ingredient.getWeight() + " gramm.");
        }
    }

    public void findIngredientsByCalories(double lowerCalories, double upperCalories) { // метод возвращает ингредиенты (по калориям) в заданном диапазоне
        System.out.println("Ingredients by calories from "
                + lowerCalories + " to " + upperCalories + " are: ");
        for (Ingredient ingredient : ingredients) {
            if (ingredient.getCalories() >= lowerCalories
                    && ingredient.getCalories() <= upperCalories) {
                System.out.println(ingredient.getNameOfIngredient() + ", "
                        + ingredient.getCalories() + " per 100 kcal.");
            }
        }
    }
}
