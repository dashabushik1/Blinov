package chapter4.task7.tours;

import chapter4.task7.enums.Duration;
import chapter4.task7.enums.Food;
import chapter4.task7.enums.Transfer;

public class Tour {

    public String type;
    final private Duration duration;
    final private Food food;
    final private Transfer transfer;
    final private int COST;

    public Tour(Duration duration, Food food, Transfer transfer, int COST) {
        this.duration = duration;
        this.food = food;
        this.transfer = transfer;
        this.COST = COST;
    }

    public Duration getDuration() {
        return duration;
    }

    public Food getFood() {
        return food;
    }

    public Transfer getTransfer() {
        return transfer;
    }

    public int getCOST() {
        return COST;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "\n--------------------------\nType: " + type + " \n|Duration: " + duration + " \n|Food: " + food + " \n|Transfer: " + transfer
                + " \n|Cost: " + COST + " $.";
    }
}
