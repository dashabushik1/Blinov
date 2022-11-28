/**
 * 9. Ввести с консоли n целых чисел. На консоль вывести "счастливые числа".
 */
package chapter1.variantB;

public class LuckyNumbers {

    public static void main(String[] args) {

        int[] inputValues = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            inputValues[i] = Integer.parseInt(args[i]);

            if ((inputValues[i] < 1000000) && (inputValues[i] > 99999)) {

                int dig1 = inputValues[i] % 10;
                int dig2 = (inputValues[i] % 100) / 10;
                int dig3 = (inputValues[i] % 1000) / 100;
                int dig4 = (inputValues[i] % 10000) / 1000;
                int dig5 = (inputValues[i] % 100000) / 10000;
                int dig6 = (inputValues[i] % 1000000) / 100000;

                if ((dig1 + dig2 + dig3) == (dig4 + dig5 + dig6)) {
                    System.out.println("Lucky numbers: " + inputValues[i] + " ");
                }
            }
        }
    }
}