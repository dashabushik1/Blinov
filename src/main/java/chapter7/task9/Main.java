/**
 * 9. Создать массив целых чисел. Используя лямбда-выражение, отсортировать массив по убыванию.
 */
package chapter7.task9;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Integer [] numbers = {1, 5, 10, 44, 67, 99, 100, 3, 55, 54, 90};

        Arrays.sort(numbers, (n1, n2) -> Integer.compare(n2, n1));
        for (int n : numbers) {
            System.out.print(n + " ");
        }
    }
}
