package chapter4.task8;

public class MobilePlan {
    public String nameOfMobilePlan; // название тарифного плана
    public int costOfSubscriptionFee; // стоимость абоненской платы в месяц
    private int numberOfClients; // количество клиентов / тариф

    public MobilePlan(String nameOfMobilePlan, int costOfSubscriptionFee, int numberOfClients) {
        this.nameOfMobilePlan = nameOfMobilePlan;
        this.costOfSubscriptionFee = costOfSubscriptionFee;
        this.numberOfClients = numberOfClients;
    }

    public String getNameOfMobilePlan() {
        return nameOfMobilePlan;
    }

    public int getCostOfSubscriptionFee() {
        return costOfSubscriptionFee;
    }

    public int getNumberOfClients() {
        return numberOfClients;
    }

    @Override
    public String toString() {
        return "\nMobile plan: " + this.nameOfMobilePlan + " |Subscription Fee per/month: $" + this.costOfSubscriptionFee +
                " |Number of clients: " + this.numberOfClients;
    }
}
