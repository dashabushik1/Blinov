package chapter4.task5.vegetables;

public abstract class Vegetable {
    protected int weight; // вес
    protected int calorificValue; // калорийность

    protected Vegetable(int weight, double calorValForGramm) {
        this.weight = weight;
        this.calorificValue = (int) (weight * calorValForGramm);
    }

    public int getWeight() {
        return weight;
    }

    public int getCalorificValue() {
        return calorificValue;
    }
}
