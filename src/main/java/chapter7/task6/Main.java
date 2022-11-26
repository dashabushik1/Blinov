/**
 * 6. Написать функциональный интерфейс с методом, который принимает три дробных числа: a, b, c и возвращает
 * тоже дробное число. Написать реализацию такого интерфейса в виде лямбда-выражения, которое возвращает дискриминант.
 */
package chapter7.task6;

public class Main {

    public static void main(String[] args) {

        DiscriminantInterface discriminant = (a, b, c) -> {
            double d = b * b - 4 * a * c;
            return d;
        };

        double result = discriminant.countDiscriminant(4.5, 5.6, 7.0);
        System.out.println(result);
    }
}
