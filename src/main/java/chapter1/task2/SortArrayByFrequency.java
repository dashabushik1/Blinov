/**
 * 7. Ввести с консоли n целых чисел. На консоль вывести числа в порядке
 * убывания частоты встречаемости чисел.
 */
package chapter1.task2;

import java.util.Arrays;

public class SortArrayByFrequency {

    public static void main(String[] args) {

        String[] copy = new String[args.length];
        int[] frequencyOfElements = new int[args.length];

        try {
            for (int i = 0; i < args.length; i++) {
                copy[i] = args[i];

                int[] frequencyOfElement = new int[10];

                int element = Integer.parseInt(copy[i]);

                while (element > 0) {
                    ++frequencyOfElement[element % 10];
                    element /= 10;
                }

                int theBiggerFrequency = frequencyOfElement[0];

                for (int j = 1; j < frequencyOfElement.length; j++) {
                    theBiggerFrequency = Math.max(theBiggerFrequency, frequencyOfElement[j]);
                }

                frequencyOfElements[i] = theBiggerFrequency;
            }

            for (int i = 0; i < frequencyOfElements.length; i++) {
                for (int j = i + 1; j < frequencyOfElements.length; j++) {
                    if (frequencyOfElements[i] < frequencyOfElements[j]) {
                        int temp = frequencyOfElements[i];
                        frequencyOfElements[i] = frequencyOfElements[j];
                        frequencyOfElements[j] = temp;
                        String stringTemp = copy[i];
                        copy[i] = copy[j];
                        copy[j] = stringTemp;
                    }
                }
            }
            System.out.println(Arrays.toString(copy));
        } catch (NumberFormatException e) {
            System.err.println(e.getMessage());
        }
    }
}