/**
 * 6. С использованием множества выполнить попарное суммирование произвольного конечного ряда чисел по следующим правилам:
 * на первом этапе суммируются попарно рядом стоящие числа, на втором этапе суммируются результаты первого этапа
 * и т.д. до тех пор, пока не останется одно число.
 */
package chapter11.variantA.task6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(); // множество обеспечивает уникальность своих элементов
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(7);
        set.add(8);

        List<Integer> list = new ArrayList<>(set); // создаем list на основе set
        System.out.println(list);
        while (list.size() > 1) { // зацикливаемся до тех пор, пока в list более 1 элемента
            List<Integer> newList = new ArrayList<>();
            for (int i = 0; i < list.size(); i += 2) {
                int a = list.get(i);
                int b = i + 1 < list.size() ? list.get(i + 1) : 0; // если в list нечетное число элементов, то в последней итерации цикла в качестве второго слагаемого берем число 0
                newList.add(a + b);
            }
            list = newList;
            System.out.println(list);
        }
    }
}