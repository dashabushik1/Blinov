/**
 * 13. С помощью лямбда-выражений определить, можно ли из длин сторон a, b, c образовать треугольник?
 */
package chapter7.task13;

public class Main {

    public static void main(String[] args) {
        TriangleInterface triangle = (a, b, c) -> {
            return (a < (b + c)) && (b < (a + c)) && (c < (a + b));
        };

        Boolean result = triangle.isTriangleCreate(3, 5, 7);
        System.out.println(result);
    }
}
