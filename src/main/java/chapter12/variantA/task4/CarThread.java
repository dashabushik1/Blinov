package chapter12.variantA.task4;

import java.util.concurrent.TimeUnit;

public class CarThread extends Thread {
    private Parking parking;
    private Car car;

    CarThread(Parking parking, Car car) {
        this.parking = parking;
        this.car = car;
    }

    @Override
    public void run() {
        try {
            if (!parking.hasFreePlaces()) {
                System.out.println(("На парковке нет свободных мест."));
            }
            if (parking.carSemaphore.tryAcquire(car.getMaxWaitingTime(), TimeUnit.SECONDS)) {
                int parkingPlace = parking.letCarIn(car);
                System.out.println(("Машина с номером %s припарковалась на месте #%s. Машина с номером %s будет занимать место %d минут. Свободных мест на стоянке: %d"));

                TimeUnit.SECONDS.sleep(car.getMaxParkingTime());

                parking.letCarOut(car);
                System.out.println(("Машина с номером %s освободила место на стоянке. Свободных мест на стоянке: %d"));

                parking.carSemaphore.release();
                sleep(500);
            } else {
                System.out.println(("Максимальное время ожидания для машины с номером %s превышено. Машина покидает очередь"));
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}