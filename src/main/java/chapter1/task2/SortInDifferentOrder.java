/* 7.Ввести с консоли n целых чисел. На консоль вывести отсортированные числа в порядке возрастания и убывания. */

package chapter1.task2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class SortInDifferentOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of digits: ");
        int size = scanner.nextInt();
        System.out.println("Enter numbers: ");
        int[] allNumbers = new int[size];


        for (int i = 0; i < allNumbers.length; i++) {
            allNumbers[i] = scanner.nextInt();
        }

        System.out.println("Sort Ascending: ");
        Arrays.sort(allNumbers);
        System.out.println(Arrays.toString(allNumbers));

        System.out.println(" ");
        System.out.println("Sort descending: ");
        List<Integer> allNumbers2 = Arrays.stream(allNumbers).boxed().collect(Collectors.toList());
        Collections.sort(allNumbers2, Collections.reverseOrder());
        System.out.println(allNumbers2);
    }
}
