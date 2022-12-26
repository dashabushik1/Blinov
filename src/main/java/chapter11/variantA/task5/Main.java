/**
 * 5. Определить множество на основе множества целых чисел. Создать методы для определения пересечения и объединения множеств.
 */
package chapter11.variantA.task5;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();  // Интерфейс Set<E> объявляет поведение коллекции, не допускающей дублирования элементов
        set1.add(3);
        set1.add(5);
        set1.add(7);
        set1.add(12);

        Set<Integer> set2 = new HashSet<>();
        set2.add(2);
        set2.add(5);
        set2.add(8);
        set2.add(11);
        set2.add(12);
        set2.add(13);

        System.out.println(mergeSets(set1, set2));
        System.out.println(getIntersection(set1, set2));

    }

    public static Set<Integer> mergeSets(Set<Integer> s1, Set<Integer> s2) {
        Set<Integer> mergedSets = new HashSet<>();
        Stream.of(s1, s2).forEach(mergedSets::addAll);
        return mergedSets;
    }

    public static Set<Integer> getIntersection(Set<Integer> s1, Set<Integer> s2) {
        Set<Integer> commonNumbers = new HashSet<>();
        for (Integer x : s1) {
            if (s2.contains(x)) {
                commonNumbers.add(x);
            }
        }
        return commonNumbers;
    }
}
