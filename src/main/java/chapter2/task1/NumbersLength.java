/**
 * 2. Ввести n чисел с консоли. Упорядочить и вывести числа в порядке возрастания (убывания) значений
 * их длины.
 */
package chapter2.task1;

public class NumbersLength {

    public static void main(String[] args) {

        int[] numberCounter = new int[args.length];
        int[] inputNumbers = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            inputNumbers[i] = Integer.parseInt(args[i]);

            int number = inputNumbers[i];
            while (number > 0) {
                numberCounter[i]++;           // считаем количество цифр в числах
                number /= 10;
            }
        }

        for (int i = 0; i < numberCounter.length; i++) {
            for (int j = i + 1; j < numberCounter.length; j++) {
                if(numberCounter[i] > numberCounter[j]) {
                    int value = numberCounter[i];
                    numberCounter[i] = numberCounter[j];
                    numberCounter[j] = value;

                    int x = inputNumbers[i];
                    inputNumbers[i] = inputNumbers[j];
                    inputNumbers[j] = x;
                }
            }
            System.out.print(inputNumbers[i] + " ");   // вывод по возрастанию значений длины
        }

        System.out.println(" ");
        for (int i = 0; i < numberCounter.length; i++) {
            for (int j = i + 1; j < numberCounter.length; j++) {
                if(numberCounter[i] < numberCounter[j]) {
                    int value = numberCounter[j];
                    numberCounter[j] = numberCounter[i];
                    numberCounter[i] = value;

                    int x = inputNumbers[j];
                    inputNumbers[j] = inputNumbers[i];
                    inputNumbers[i] = x;
                }
            }
            System.out.print(inputNumbers[i] + " ");  // вывод по убыванию значений длины
        }
    }
}
