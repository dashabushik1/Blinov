/**
 * 15. Дан прямоугольный треугольник с катетами a и b. С помощью лямбда-выражения найти радиус
 * вписанной в треугольник окружности. Теорма Пифагора - c² = a² + b², радиус окружности - r = (a + b + c) / 2.
 */
package chapter7.task15;

public class Main {

    public static void main(String[] args) {

        TriangleInterface radius = (a, b) -> {
            double c = Math.sqrt((a * a) + (b * b));
            return (a + b + c) / 2;
        };
        System.out.println(radius.calculateRadius(4, 3));
    }
}
