/**
 * 2. Ввести n чисел с консоли. Упорядочить и вывести числа в порядке возрастания (убывания) значений
 * их длины.
 */
package chapter2.task1;

public class NumbersLength {

    public static void main(String[] args) {

        int[] inputNumbers = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            inputNumbers[i] = Integer.parseInt(args[i]);
        }

        for (int i = 0; i < args.length; i++) {
            for (int j = i + 1; j < args.length; j++) {
                if (inputNumbers[i] > inputNumbers[j]) {
                    int value = inputNumbers[i];
                    inputNumbers[i] = inputNumbers[j];
                    inputNumbers[j] = value;
                }
            }
            System.out.print(inputNumbers[i] + " ");   // вывод в порядке возрастания значений длины
        }

        System.out.println(" ");
        for (int i = 0; i < args.length; i++) {
            for (int j = i + 1; j < args.length; j++) {
                if (inputNumbers[i] < inputNumbers[j]) {
                    int value = inputNumbers[i];
                    inputNumbers[i] = inputNumbers[j];
                    inputNumbers[j] = value;
                }
            }
            System.out.print(inputNumbers[i] + " ");   // вывод в порядке убывания значений длины
        }
    }
}
