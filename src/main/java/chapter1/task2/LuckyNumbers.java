/**
 * 9. Ввести с консоли n целых чисел. На консоль вывести "счастливые числа".
 */
package chapter1.task2;

public class LuckyNumbers {

    public static void main(String[] args) {

        int[] inputNumbers = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            inputNumbers[i] = Integer.parseInt(args[i]);

            if ((inputNumbers[i] < 1000000) && (inputNumbers[i] > 99999)) {

                int dig1 = inputNumbers[i] % 10;
                int dig2 = (inputNumbers[i] % 100) / 10;
                int dig3 = (inputNumbers[i] % 1000) / 100;
                int dig4 = (inputNumbers[i] % 10000) / 1000;
                int dig5 = (inputNumbers[i] % 100000) / 10000;
                int dig6 = (inputNumbers[i] % 1000000) / 100000;

                if ((dig1 + dig2 + dig3) == (dig4 + dig5 + dig6)) {
                    System.out.println("Lucky numbers: " + inputNumbers[i] + " ");
                }
            }
        }
    }
}