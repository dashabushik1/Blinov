/**
 * 7.Ввести с консоли n целых чисел. На консоль вывести отсортированные числа в порядке возрастания и убывания.
 */
package chapter1.task2;

import java.util.Arrays;

public class SortInDifferentOrder {

    public static void main(String[] args) {

        int[] masSorted = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            masSorted[i] = Integer.parseInt(args[i]);
        }

        for (int i = 0; i < masSorted.length; i++) {
            for (int j = i + 1; j < masSorted.length; j++) {
                if (masSorted[i] > masSorted[j]) {
                    int value = masSorted[j];
                    masSorted[j] = masSorted[i];
                    masSorted[i] = value;
                }
            }
        }

        int[] masSortedCopy = Arrays.copyOf(masSorted, masSorted.length);
        for (int i = 0; i < masSortedCopy.length; i++) {
            for (int j = i + 1; j < masSortedCopy.length; j++) {
                if (masSortedCopy[i] < masSortedCopy[j]) {
                    int value = masSortedCopy[j];
                    masSortedCopy[j] = masSortedCopy[i];
                    masSortedCopy[i] = value;
                }
            }
        }
        System.out.println("Sorted numbers by ascending: " + Arrays.toString(masSorted));
        System.out.println("Sorted numbers by descending: " + Arrays.toString(masSortedCopy));
    }
}


