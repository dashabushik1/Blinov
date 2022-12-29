/**
 * 2. На базе коллекций реализовать структуру хранения чисел с поддержкой следующих операций:
 * • добавление/удаление числа;
 * • поиск числа, наиболее близкого к заданному (т.е. модуль разницы минимален).
 */
package chapter11.variantB.task2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add((int) (Math.random() * 100));
        }
        System.out.println(findMostCloseNumber(numbers, 5));
        System.out.println(numbers);
        numbers.remove(3);
        System.out.println(numbers);
    }

    public static Integer findMostCloseNumber(List<Integer> list, Integer number) {
        Iterator<Integer> iterator = list.iterator();
        Integer min = iterator.next();
        while (iterator.hasNext()) {
            Integer elem = iterator.next();
            if (Math.abs(elem - number) < Math.abs(min - number)) {
                min = elem;
            }
        }
        return min;
    }
}