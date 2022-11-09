/**
 * 4. Написать функциональный интерфейс с методом, который принимает число и возвращает булево значение.
 * Написать реализацию такого интерфейса в виде лямбда-выражения, которое возвращает true, если переданное число
 * делится без остатка на 13.
 */
package chapter7.task4;

public class Main {

    public static void main(String[] args) {
        BooleanInterface r = n -> n % 13 == 0;
        boolean number = r.calculate(90);
        System.out.println(number);
    }
}
