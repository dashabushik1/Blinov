/**
 * 7. Ввести n чисел с консоли. Найти число, состоящее только из различных цифр.
 * Если таких чисел несколько, найти первое из них.
 */
package chapter2.variantA;

public class NumbersWithDifferentDigits {

    public static void main(String[] args) {

        int[][] arrays = new int[2][args.length];
        int variousDigits = 0;

        for (int i = 0; i < args.length; i++) {
            int number = Integer.parseInt(args[i]);
            arrays[0][i] = number;

            boolean[] arrayOfRepeats = new boolean[10];
            while (number > 0) {
                arrayOfRepeats[number % 10] = true;
                number /= 10;
            }

            for (int j = 0; j < arrayOfRepeats.length; j++) {
                if (arrayOfRepeats[j]) {
                    ++arrays[1][i];
                }
            }
            variousDigits = Math.max(variousDigits, arrays[1][i]);
        }
        for (int j = 0; j < arrays[0].length; j++) {
            if (arrays[1][j] == variousDigits) {
                System.out.print(arrays[0][j] + " ");
                System.exit(1);
            }
        }
    }
}
