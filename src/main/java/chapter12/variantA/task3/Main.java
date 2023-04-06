/**
 * 3. Разработать многопоточное приложение. Использовать возможности, предоставляемые пакетом java.util.concurrent.
 * Не использовать слово synchronized. Все сущности, желающие получить доступ к ресурсу, должны быть потоками.
 * CallCenter. В организации работает несколько операторов. Оператор может обслуживать только одного клиента,
 * остальные должны ждать своей очереди. Клиент может положить трубку и перезвонить еще раз через некоторое время.
 */
package chapter12.variantA.task3;

import java.util.concurrent.Semaphore;

public class Main {

    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(4);
        for (int i = 1; i < 10; i++) {
            try {
                new CallCenterWork("№ " + i, semaphore).start();
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}