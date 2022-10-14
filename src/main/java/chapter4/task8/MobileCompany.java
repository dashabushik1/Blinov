package chapter4.task8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MobileCompany {

    final private String NAME_OF_COMPANY;
    private List<MobilePlan> mobilePlans = new ArrayList<>();

    public MobileCompany() {
        NAME_OF_COMPANY = "Verizon";
    }

    public String getNAME_OF_COMPANY() {
        return NAME_OF_COMPANY;
    }

    public List<MobilePlan> getMobilePlans() {
        return mobilePlans;
    }

    public void addMobilePlans(MobilePlan mobilePlan) { // метод добавляет тарифные планы в компанию
        mobilePlans.add(mobilePlan);
    }

    public int getTotalNumberOfClients() { // метод считает общее количество клиентов в мобильной компании
        int totalNumber = 0;
        for (MobilePlan mobilePlan : mobilePlans) {
            totalNumber += mobilePlan.getNumberOfClients();
        }
        return totalNumber;
    }

    public void sortMobilePlansBySubscriptionFee() { // метод сортирует тарифы на основе размера абонентской платы по возрастанию
        Collections.sort(mobilePlans, (MobilePlan p1, MobilePlan p2) -> {
            return p1.costOfSubscriptionFee - p2.costOfSubscriptionFee;
        });
        for (MobilePlan mobilePlan : mobilePlans) {
            System.out.println(mobilePlan.getNameOfMobilePlan() + " | $" +
                    mobilePlan.getCostOfSubscriptionFee() + " per/month.");
        }
    }

    public void findMobilePlanInTheGivenRange(int fromFee, int toFee) { // метод ищет тарифы в заданном диапазоне
        System.out.println("Mobile plans from $40 to $70 per/month: ");
        for (int i = 0; i < mobilePlans.size(); i++) {
            if (mobilePlans.get(i).getCostOfSubscriptionFee() >= fromFee &&
                    mobilePlans.get(i).getCostOfSubscriptionFee() <= toFee) {
                System.out.println(mobilePlans.get(i).getNameOfMobilePlan() + " | $" +
                        mobilePlans.get(i).costOfSubscriptionFee + " per/month.");
            }
        }
    }
}
