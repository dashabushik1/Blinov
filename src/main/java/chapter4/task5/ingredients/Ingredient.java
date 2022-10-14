package chapter4.task5.ingredients;

public abstract class Ingredient {
    private String nameOfIngredient; // название
    private double weight; // вес в граммах
    private double caloriesPer100Gram; // калорийность в 100 граммах

    public Ingredient(String nameOfIngredient, double calories, double weight) {
        this.nameOfIngredient = nameOfIngredient;
        this.caloriesPer100Gram = calories;
        this.weight = weight;
    }

    public String getNameOfIngredient() {
        return nameOfIngredient;
    }

    public double getCalories() {
        return caloriesPer100Gram;
    }

    public double getWeight() {
        return weight;
    }

    public double getTotalCalories() {
        return caloriesPer100Gram * weight / 100.0;
    }

    @Override
    public String toString() {
        return (nameOfIngredient + ", " + weight + " gramm, " +
                getTotalCalories() + " kcal.");
    }
}
