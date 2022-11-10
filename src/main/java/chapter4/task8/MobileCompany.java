package chapter4.task8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MobileCompany {

    private final String name;
    private List<MobilePlan> mobilePlans = new ArrayList<>();

    public MobileCompany() {
        name = "Verizon";
    }

    public String getName() {
        return name;
    }

    public List<MobilePlan> getMobilePlans() {
        return mobilePlans;
    }

    public void addMobilePlan(MobilePlan mobilePlan) { // метод добавляет тарифные планы в компанию
        mobilePlans.add(mobilePlan);
    }

    public int getTotalNumberOfClients() { // метод считает общее количество клиентов в мобильной компании
        int totalNumber = 0;
        for (MobilePlan mobilePlan : mobilePlans) {
            totalNumber += mobilePlan.getClients();
        }
        return totalNumber;
    }

    public void sortMobilePlansBySubscriptionFee() { // метод сортирует тарифы на основе размера абонентской платы по возрастанию
        Collections.sort(mobilePlans, (MobilePlan p1, MobilePlan p2) -> {
            return p1.subscriptionFee - p2.subscriptionFee;
        });
        for (MobilePlan mobilePlan : mobilePlans) {
            System.out.println(mobilePlan.getName() + " | $" +
                    mobilePlan.getName() + " per/month.");
        }
    }

    public void findMobilePlanInTheGivenRange(int fromFee, int toFee) { // метод ищет тарифы в заданном диапазоне
        System.out.println("Mobile plans from $40 to $70 per/month: ");
        for (int i = 0; i < mobilePlans.size(); i++) {
            if (mobilePlans.get(i).getSubscriptionFee() >= fromFee &&
                    mobilePlans.get(i).getSubscriptionFee() <= toFee) {
                System.out.println(mobilePlans.get(i).getName() + " | $" +
                        mobilePlans.get(i).getSubscriptionFee() + " per/month.");
            }
        }
    }
}
