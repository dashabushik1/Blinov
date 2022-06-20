/**
 * 2. Ввести с консоли n целых чисел. На консоль вывести наибольшее и наименьшее число.
 */
package chapter1.task2;

public class MaxMinNumbers {

    public static void main(String[] args) {

        if (args.length == 0) {
            return;
        }

        int max = Integer.parseInt(args[0]);
        int min = Integer.parseInt(args[0]);

        for (int i = 1; i < args.length; i++) {
            int x = Integer.parseInt(args[i]);
            if (x > max) {
                max = x;
            } else if (x < min) {
                min = x;
            }
        }
        System.out.print("Max number: " + max + " ");
        System.out.println(" ");
        System.out.print("Min number: " + min + " ");
    }
}