/**
 * 2. Разработать многопоточное приложение. Использовать возможности, предоставляемые пакетом java.util.concurrent.
 * Не использовать слово synchronized. Все сущности, желающие получить доступ к ресурсу, должны быть потоками.
 * Свободная касса. В ресторане быстрого обслуживания есть несколько касс. Посетители стоят в очереди в конкретную кассу,
 * но могут перейти в другую очередь при уменьшении или исчезновении там очереди.
 */
package chapter12.variantA.task2;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        List<Cashier> cashiers = new LinkedList<>();
        List<Customer> customers = new LinkedList<>();

        for (int i = 0; i < 3; i++) {
            cashiers.add(new Cashier("Cashier " + i));
        }

        for (int i = 0; i < 10; i++) {
            customers.add(new Customer("Customer " + i, cashiers));
        }

        for (Customer customer : customers) {
            customer.join();
        }
        System.out.println("All customers have been served");
    }
}
