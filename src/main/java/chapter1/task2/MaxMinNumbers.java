/**
 * 2. Ввести с консоли n целых чисел. На консоль вывести наибольшее и наименьшее число.
 */
package chapter1.task2;

import java.util.Arrays;

public class MaxMinNumbers {

    public static void main(String[] args) {

        Arrays.sort(args);
        int maxNumber = Integer.parseInt(args[args.length - 1]);

        System.out.println("Max number is: " + maxNumber);
        System.out.println("Min number is: " + args[0]);
    }
}