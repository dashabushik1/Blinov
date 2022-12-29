/**
 * 5. Задан список целых чисел и некоторое число X. Не используя вспомогательных объектов и методов сортировки
 * и не изменяя размера списка, переставить элементы списка так,
 * чтобы сначала шли числа, не превосходящие X, а затем числа, больше X.
 */
package chapter11.variantB.task4;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(20);
        numbers.add(3);
        numbers.add(-10);
        numbers.add(8);
        numbers.add(100);
        numbers.add(-32);
        int x = 50;

        System.out.println(getList(numbers, x));

    }
    public static List<Integer> getList(List<Integer> list, int x) {
        int right = 0; // < 3
        int left = 0; // > 3
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > x) {
                left = list.get(i);
            } else {
                right = list.get(i);
            }
        }
        return list;
    }
}
