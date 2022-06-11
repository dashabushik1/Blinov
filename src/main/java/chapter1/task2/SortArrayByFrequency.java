/* 8. Ввести с консоли n целых чисел. На консоль вывести числа в порядке убывания частоты встречаемости чисел. */

package chapter1.task2;

import java.util.Arrays;
import java.util.Scanner;

public class SortArrayByFrequency {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of digits: ");
        int size = scanner.nextInt();
        System.out.println("Enter numbers: ");
        int[] allInputNumbers = new int[size];

        for (int i = 0; i < size; i++) {
            allInputNumbers[i] = scanner.nextInt();
        }

        int[] duplicates = new int[size];
        for (int i = 0; i < allInputNumbers.length; i++) {
            for (int j = 0; j < allInputNumbers.length; j++) {
                if (allInputNumbers[i] == allInputNumbers[j]) {
                    duplicates[i]++;
                }
            }
        }

    }
}

