package chapter4.task5.vegetables;

public class Cabbage extends Vegetable {
    public final static double CALORIFIC_VAL_1GR = 0.27; // калорийность в 1 гр
    public final static String COLOR = "Green"; // цвет
    private int leavesCount; // листья

    public Cabbage(int weight, int leavesCount) {
        super(weight, CALORIFIC_VAL_1GR);
        this.leavesCount = leavesCount;
    }

    public int getLeavesCount() {
        return leavesCount;
    }

    public void setLeavesCount(int leavesCount) {
        this.leavesCount = leavesCount;
    }

    @Override
    public String toString() {
        return COLOR + " cabbage, weight: " + weight + " gram, leaves count: " + leavesCount + ", calorific value: "
                + calorificValue + " kcal.";
    }
}