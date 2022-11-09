/**
 * 10. Дано три разных целых числа. Реализовать лямбда-выражение, которое находит наибольшее из этих трех чисел.
 */
package chapter7.task10;

public class Main {

    public static void main(String[] args) {
        Numbers numbers = (a, b, c) -> {
            int max = a;
            if (max < b) {
                max = b;
            }
            if (max < c) {
                max = c;
            }
            return max;
        };

        int maxNumber = numbers.getNumbers(3, 10, 6);
        System.out.println("Max number is " + maxNumber);
    }
}
