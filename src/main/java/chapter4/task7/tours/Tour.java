package chapter4.task7.tours;

import chapter4.task7.enums.Duration;
import chapter4.task7.enums.TypeOfService;
import chapter4.task7.enums.Transfer;

public class Tour {

    public String type;
    private final Duration duration;
    private final TypeOfService typeOfService;
    private final Transfer transfer;
    private final int cost;

    public Tour(Duration duration, TypeOfService typeOfService, Transfer transfer, int cost) {
        this.duration = duration;
        this.typeOfService = typeOfService;
        this.transfer = transfer;
        this.cost = cost;
    }

    public Duration getDuration() {
        return duration;
    }

    public TypeOfService getTypeOfService() {
        return typeOfService;
    }

    public Transfer getTransfer() {
        return transfer;
    }

    public int getCost() {
        return cost;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "\n--------------------------\nType: " + type + " \n|Duration: " + duration + " \n|TypeOfService: " + typeOfService + " \n|Transfer: " + transfer
                + " \n|Cost: " + cost + " $.";
    }
}
