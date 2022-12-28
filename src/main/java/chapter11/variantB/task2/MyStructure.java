package chapter11.variantB.task2;

import java.util.ArrayList;
import java.util.Iterator;

public class MyStructure extends ArrayList<Integer> {

    public Integer findMostCloseNumber(Integer number) {
        Iterator<Integer> iterator = iterator();
        Integer min = iterator.next();

        while (iterator.hasNext()) {
            Integer element = iterator.next();
            if (Math.abs(element - number) < Math.abs(min - number)) {
                min = element;
            }
        }
        return min;
    }
}
