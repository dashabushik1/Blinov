/**
 * 2. Ввести с консоли n целых чисел. На консоль вывести наибольшее и наименьшее число.
 */
package chapter1.task2;

public class MaxMinNumbers {

    public static void main(String[] args) {

        int[] masSorted = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            masSorted[i] = Integer.parseInt(args[i]);
        }

        int value = 0;
        for (int i = 0; i < masSorted.length; i++) {
            for (int j = i + 1; j < masSorted.length; j++) {
                if (masSorted[i] > masSorted[j]) {
                    value = masSorted[j];
                    masSorted[j] = masSorted[i];
                    masSorted[i] = value;
                }
            }
        }

        System.out.println("Min number is: " + masSorted[0]);

        int maxNumber = masSorted[masSorted.length - 1];
        System.out.println("Max number is: " + maxNumber);
    }
}