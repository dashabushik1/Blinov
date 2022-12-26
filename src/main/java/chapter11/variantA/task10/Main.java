/**
 * 10. Заполнить HashMap 10 объектами <Integer, String>. Найти строки, у которых ключ > 5.
 * Если ключ = 0, вывести строки через запятую. Перемножить все ключи, где длина строки > 5.
 */
package chapter11.variantA.task10;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<Integer, String> data = getFilledMapWithTenObjects();
        System.out.println(findRowsWithAKeyGreaterThanFive(data));
        findRowsWithAKeyValueZero(data);
        System.out.println();
        System.out.println(findStringsWithLengthGreaterThanFive(data));
    }

    public static Map<Integer, String> getFilledMapWithTenObjects() {
        Map<Integer, String> map = new HashMap<>();
        map.put(0, "Gabriel");
        map.put(1, "Emma");
        map.put(2, "Alexander");
        map.put(3, "Gordon");
        map.put(4, "Raymond");
        map.put(5, "Steve");
        map.put(6, "Bill");
        map.put(7, "Dave");
        map.put(8, "Rosy");
        map.put(9, "King");
        return map;
    }

    public static Map<Integer, String> findRowsWithAKeyGreaterThanFive(Map<Integer, String> map) {
        Map<Integer, String> newMap = new HashMap<>();
        for (Map.Entry<Integer, String> set : map.entrySet()) {
            if (set.getKey() > 5) {
                newMap.put(set.getKey(), set.getValue());
            }
        }
        return newMap;
    }

    public static void findRowsWithAKeyValueZero(Map<Integer, String> map) { // как найти строки, если HashMap не хранит одинаковые ключи?
        map.entrySet()
                .stream().filter(e -> e.getKey() == 0)
                .forEach(e -> System.out.print(e.getValue() + ", "));
    }

    public static int findStringsWithLengthGreaterThanFive(Map<Integer, String> map) {
        int sum = 0;
        for (Map.Entry<Integer, String> set : map.entrySet()) {
            if (set.getValue().length() > 5) {
                sum += set.getKey();
            }
        }
        return sum;
    }
}