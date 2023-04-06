package chapter12.variantA.task2;

import java.util.List;

public class Customer extends Thread {

    volatile List<Cashier> cashiers;
    private Cashier currentCashier;
    volatile boolean isServed;

    public Customer(String name, List<Cashier> cashiers) {
        super(name);
        this.cashiers = cashiers;
        isServed = false;
        start();
    }

    public void setServed(boolean isServed) {
        this.isServed = isServed;
    }

    @Override
    public void run() {
        int shortestQueueId = findShortestQueue(0);
        currentCashier = cashiers.get(shortestQueueId);
        currentCashier.enqueueCustomer(this);

        while (!isServed){
            if (this != currentCashier.getCustomerQueue().peek()) {
                Cashier oldCashier = null;
                synchronized (this) {
                    Cashier bufferCashier = findFreeQueue();
                    if (bufferCashier != null) {
                        oldCashier = currentCashier;
                        currentCashier = bufferCashier;
                    }
                }
                if (oldCashier != null) {
                    oldCashier.dequeueCustomer(this);
                    currentCashier.enqueueCustomer(this);
                }
            }
        }
        System.out.println(Thread.currentThread().getName() + " was served by " + currentCashier);
    }

    private int findShortestQueue(int shortestQueueId) {
        int shortestQueueLength = Integer.MAX_VALUE;
        for (int i = 0; i < cashiers.size(); i++) {
            int currentQueueLength = cashiers.get(i).getCustomerQueue().size();
            if (currentQueueLength == 0) {
                shortestQueueId = i;
                shortestQueueLength = 0;
                break;
            } else {
                if (currentQueueLength < shortestQueueLength) {
                    shortestQueueId = i;
                    shortestQueueLength = currentQueueLength;
                }
            }
        }
        return shortestQueueId;
    }
    private Cashier findFreeQueue () {
        for (int i = 0; i < cashiers.size(); i++) {
            int currentQueueLength = cashiers.get(i).getCustomerQueue().size();
            if (currentQueueLength == 0) {
                return currentCashier = cashiers.get(i);
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return getName();
    }
}
