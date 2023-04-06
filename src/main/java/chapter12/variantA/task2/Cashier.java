package chapter12.variantA.task2;

import java.util.LinkedList;

public class Cashier extends Thread {

    private final LinkedList<Customer> customerQueue = new LinkedList<>();

    public Cashier(String name) {
        super(name);
        this.setDaemon(true);
        start();
    }

    public LinkedList<Customer> getCustomerQueue() {
        return customerQueue;
    }

    public synchronized void enqueueCustomer(Customer customer){
        customerQueue.addLast(customer);
        notifyAll();
    }
    public synchronized void dequeueCustomer(Customer customer){
        customerQueue.remove(customer);
        notifyAll();
    }

    @Override
    public void run() {
        while (true) {
            try {
                synchronized (this) {
                    while (customerQueue.size() == 0) {
                        wait();
                    }
                }
                Customer currentCustomer;
                synchronized ( currentCustomer = customerQueue.peek()) {
                    System.out.println(this + " have start to serve " + currentCustomer);
                    Thread.sleep(2000);
                    currentCustomer.setServed(true);
                    currentCustomer.notifyAll();
                }

                synchronized (this) {
                    customerQueue.poll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public String toString() {
        return getName();
    }
}
