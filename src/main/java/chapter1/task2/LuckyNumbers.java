/**
 * 9. Ввести с консоли n целых чисел. На консоль вывести "счастливые числа".
 */
package chapter1.task2;

public class LuckyNumbers {

    public static void main(String[] args) {

        int[] inputNumbers = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            inputNumbers[i] = Integer.parseInt(args[i]);

            int number = inputNumbers[i];
            if ((inputNumbers[i] < 999999) && (inputNumbers[i] > 100000)) { // в промежутке от 100000 до 999999 (шестизначные)

                int dig1 = number % 10;
                int dig2 = (number % 100) / 10;
                int dig3 = (number % 1000) / 100;
                int dig4 = (number % 10000) / 1000;
                int dig5 = (number % 100000) / 10000;
                int dig6 = (number % 1000000) / 100000;

                if ((dig1 + dig2 + dig3) == (dig4 + dig5 + dig6)) {
                    System.out.println(inputNumbers[i] + " ");
                }
            }
        }
    }
}