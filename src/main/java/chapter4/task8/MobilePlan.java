package chapter4.task8;

public class MobilePlan {

    public String name; // название тарифного плана
    public int subscriptionFee; // стоимость абоненской платы в месяц
    private int clients; // количество клиентов / тариф

    public MobilePlan(String name, int subscriptionFee, int clients) {
        this.name = name;
        this.subscriptionFee = subscriptionFee;
        this.clients = clients;
    }

    public String getName() {
        return name;
    }

    public int getSubscriptionFee() {
        return subscriptionFee;
    }

    public int getClients() {
        return clients;
    }

    @Override
    public String toString() {
        return "\nMobile plan: " + this.name + " |Subscription Fee per/month: $" + this.subscriptionFee +
                " |Number of clients: " + this.clients;
    }
}
