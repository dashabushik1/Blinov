/**
 * 4. Ввести n чисел с консоли. Найти число, в котором число различных цифр минимально.
 * Если таких чисел несколько, найти первое из них.
 */
package chapter2.task1;

public class UniqueNumbers {

    public static void main(String[] args) {

        int[][] arrays = new int[2][args.length];
        int minVarietyOfNumbers = 10;

        for (int i = 0; i < args.length; i++) {
            boolean[] arrayOfFlags = new boolean[10];
            int number = Integer.parseInt(args[i]);
            arrays[0][i] = number;
            while (number > 0) {
                arrayOfFlags[number % 10] = true;
                number /= 10;
            }
            for (int j = 0; j < arrayOfFlags.length; j++) {
                if (arrayOfFlags[j]) {
                    ++arrays[1][i];
                }
            }
            minVarietyOfNumbers = Math.min(minVarietyOfNumbers, arrays[1][i]);
        }
        for (int j = 0; j < arrays[0].length; j++) {
            if (arrays[1][j] == minVarietyOfNumbers) {
                System.out.print(arrays[0][j] + " ");
            }
        }
    }
}
