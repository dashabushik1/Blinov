/**
 * 3. Реализовать класс, моделирующий работу N-местной автостоянки. Машина
 * подъезжает к определенному месту и едет вправо, пока не встретится свободное место.
 * Класс должен поддерживать методы, обслуживающие приезд и отъезд машины.
 */
package chapter11.variantB.task3;

public class Main {

    public static void main(String[] args) {

        Parking parking = new Parking(10);

        for (int i = 0; i < 11; i++) {
            parking.arriveCar();
        }
        parking.leaveCar();
        parking.leaveCar();
        for (int i = 0; i < parking.getParking().size(); i++) {
            System.out.println(parking.getParking().get(i));
        }
    }
}
