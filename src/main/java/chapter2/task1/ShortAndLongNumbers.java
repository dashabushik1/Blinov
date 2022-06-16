/**
 * 1. Ввести n чисел с консоли. Найти самое короткое и самое длинное число. Вывести найденные числа
 * и их длину.
 */
package chapter2.task1;

public class ShortAndLongNumbers {

    public static void main(String[] args) {

        int[] inputNumbers = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            inputNumbers[i] = Integer.parseInt(args[i]);
        }

        int[] numberCounter = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            for (int j = i + 1; j < args.length; j++) {
                if (inputNumbers[i] > inputNumbers[j]) {
                    int value = inputNumbers[i];
                    inputNumbers[i] = inputNumbers[j];
                    inputNumbers[j] = inputNumbers[i];
                    inputNumbers[j] = value;
                }
            }

            int number = inputNumbers[i];
            while (number > 0) {
                number /= 10;
                numberCounter[i]++;
            }
        }
        System.out.println("The max number is " + inputNumbers[inputNumbers.length - 1] + ", and its length is " + numberCounter[numberCounter.length - 1] + ".");
        System.out.println("The min number is " + inputNumbers[0] + ", and its length is " + numberCounter[0] + ".");
    }
}






