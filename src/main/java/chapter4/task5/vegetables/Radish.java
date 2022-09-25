package chapter4.task5.vegetables;

public class Radish extends Vegetable {
    public final static double CALORIFIC_VAL_1GR = 0.19; // калорийность в 1 гр
    public final static String COLOR = "Red"; // цвет
    private boolean isSpicy; // пряность
    private String flowersColor; // цвет

    public Radish(int weight, boolean isSpicy, String flowersColor) {
        super(weight, CALORIFIC_VAL_1GR);
        this.isSpicy = isSpicy;
        this.flowersColor = flowersColor;
    }

    public boolean isSpicy() {
        return isSpicy;
    }

    public void setSpicy(boolean isSpicy) {
        this.isSpicy = isSpicy;
    }

    public String getFlowersColor() {
        return flowersColor;
    }

    public void setFlowersColor(String flowersColor) {
        this.flowersColor = flowersColor;
    }

    @Override
    public String toString() {
        return COLOR + " radish, weight: " + weight + " gram, spicy: " + isSpicy + ", flowers  color: " + flowersColor
                + ", calorific value: " + calorificValue + " kcal.";
    }
}
