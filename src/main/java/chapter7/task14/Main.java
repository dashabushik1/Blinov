/**
 * 14. С помощью лямбда-выражений вычислить факториал заданного числа.
 * Факториал числа n — это произведение всех натуральных чисел от 1 до n включительно.
 */
package chapter7.task14;

public class Main {

    public static void main(String[] args) {

        FactorialInterface factorial = n -> {
            int result = 1;
            for (int i = result; i <= n; i++) {
                result *= i;
            }
            return result;
        };

        System.out.println(factorial.calculate(6));
    }
}
