/**
 * 7. Создать консольное приложение, удовлетворяющее следующим требованиям:
 * • Использовать возможности ООП: классы, наследование, полиморфизм, инкапсуляция.
 * • Каждый класс должен иметь отражающее смысл название и информативный состав.
 * • Наследование должно применяться только тогда, когда это имеет смысл.
 * • При кодировании должны быть использованы соглашения об оформлении кода java code convention.
 * • Классы должны быть грамотно разложены по пакетам.
 * • Консольное меню должно быть минимальным.
 * • Для хранения параметров инициализации можно использовать файлы.
 * <p>
 * Мобильная связь. Определить иерархию тарифов мобильной компании. Создать список тарифов компании.
 * Подсчитать общую численность клиентов. Провести сортировку тарифов на основе размера абонентской платы.
 * Найти тариф в компании, соответствующий заданному диапазону параметров.
 */
package chapter4.task8;

public class Main {

    public static void main(String[] args) {

        MobileCompany company = createMobilePlans();

        System.out.println("Name of the company - " + company.getName() + ".");
        System.out.println("-------------------------------------");
        System.out.println("Mobile plans: " + company.getMobilePlans().toString().replace("[", "")
                .replace("]", ""));
        System.out.println("-------------------------------------");
        System.out.println("Total number of clients in the company: " + company.getTotalNumberOfClients() + ".");
        System.out.println("-------------------------------------");
        company.sortMobilePlansBySubscriptionFee();
        System.out.println("-------------------------------------");
        company.findMobilePlanInTheGivenRange(40, 70);
    }

    public static MobileCompany createMobilePlans() {
        MobileCompany company = new MobileCompany();
        company.addMobilePlan(new MobilePlan("5G Start", 35, 300000));
        company.addMobilePlan(new MobilePlan("Connected Device", 85, 280000));
        company.addMobilePlan(new MobilePlan("Prepaid", 65, 340000));
        company.addMobilePlan(new MobilePlan("International", 90, 430000));
        company.addMobilePlan(new MobilePlan("5G Play More", 45, 275000));
        company.addMobilePlan(new MobilePlan("5G Get More", 55, 290000));
        company.addMobilePlan(new MobilePlan("Unlimited Plus", 60, 300000));
        company.addMobilePlan(new MobilePlan("Unlimited", 50, 4000000));
        return company;
    }
}
