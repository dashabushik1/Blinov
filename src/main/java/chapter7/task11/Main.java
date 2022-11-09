/**
 * 11. Создать массив целых чисел. Убрать все четные элементы из массива
 * и заполнить в конце нулями до прежнего размера массива.
 */
package chapter7.task11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        int[] numbers = {1, 5, 10, 44, 67, 99, 100, 3, 55, 54, 90};
        List<Integer> list;

        list = Arrays.stream(numbers)
                .map(i -> i % 2 == 0 ? 0 : i)
                .boxed()
                .sorted((f, s) -> f == 0 ? 1 : s == 0 ? -1 : 0)
                .collect(Collectors.toList());

        System.out.println(list);
    }
}
