/**
 * 3. Ввести n чисел с консоли. Вывести на консоль те числа, длина которых меньше (больше) средней, а также длину.
 */
package chapter2.task1;

public class AverageLength {

    public static void main(String[] args) {

        double sum = 0;
        double averageSize = 0;

        int[] inputNumbers = new int[args.length];
        int[] numberCounter = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            inputNumbers[i] = Integer.parseInt(args[i]);

            int number = inputNumbers[i];
            while (number > 0) {
                numberCounter[i]++;
                number /= 10;
            }
        }

        for (int i = 0; i < numberCounter.length; i++) {
            sum += numberCounter[i];
            averageSize = sum / numberCounter.length;
        }

        System.out.print("Numbers whose length is more than the average length of all numbers, and its length: ");
        for (int i = 0; i < numberCounter.length; i++) {
            if (numberCounter[i] > averageSize) {
                System.out.print(inputNumbers[i] + "(" + numberCounter[i] + ")" + ";" + " ");
            }
        }
    }
}

