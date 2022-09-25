package chapter4.task5.vegetables;

public class Cucumber extends Vegetable {
    public final static double CALORIFIC_VAL_1GR = 0.15; // калорийность в 1 гр
    public final static String COLOR = "Green"; // цвет
    private int footStalkLength; // длина
    private String leavesType; // тип

    public Cucumber(int weight, int footStalkLength, String leavesType) {
        super(weight, CALORIFIC_VAL_1GR);
        this.footStalkLength = footStalkLength;
        this.leavesType = leavesType;
    }

    public int getFootStalkLength() {
        return footStalkLength;
    }

    public void setFootStalkLength(int footStalkLength) {
        this.footStalkLength = footStalkLength;
    }

    public String getLeavesType() {
        return leavesType;
    }

    public void setLeavesType(String leavesType) {
        this.leavesType = leavesType;
    }

    @Override
    public String toString() {
        return COLOR + " cucumber, weight: " + weight + " gram, leaves type: " + leavesType + ", foot stalk length: "
                + footStalkLength + " mm., calorific value: " + calorificValue + " kcal.";
    }
}
