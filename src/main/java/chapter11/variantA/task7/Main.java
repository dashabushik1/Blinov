/**
 * 7. Не используя вспомогательных объектов, переставить отрицательные элементы данного списка в конец,
 * а положительные — в начало списка.
 */
package chapter11.variantA.task7;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = createNewList();
        System.out.println(list);
        List<Integer> result = new ArrayList<>(list);
        result.sort((Integer o1, Integer o2) -> o2);
        System.out.println(result);
    }

    public static List<Integer> createNewList() {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(-2);
        integers.add(13);
        integers.add(7);
        integers.add(5);
        integers.add(8);
        integers.add(-9);
        integers.add(-3);
        integers.add(-12);
        integers.add(4);
        integers.add(-10);

        return integers;
    }
}
