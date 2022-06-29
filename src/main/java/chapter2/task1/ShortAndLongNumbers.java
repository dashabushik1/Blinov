/**
 * 1. Ввести n чисел с консоли. Найти самое короткое и самое длинное число. Вывести найденные числа
 * и их длину.
 */
package chapter2.task1;

public class ShortAndLongNumbers {

    public static void main(String[] args) {

        int[] numbers = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            numbers[i] = Integer.parseInt(args[i]);
        }

        int[] numberCounter = new int[args.length];
        int smallest = numbers[0];
        int biggest = numbers[0];

        for (int i = 0; i < args.length; i++) {
            if (numbers[i] > biggest) {
                biggest = numbers[i];
            } else if (numbers[i] < smallest) {
                smallest = numbers[i];
            }

            while (numbers[i] > 0) {
                numbers[i] /= 10;
                numberCounter[i]++;
            }
        }
        System.out.println("The max number is " + biggest + ", and its length is " + numberCounter[numberCounter.length - 1] + ".");
        System.out.println("The min number is " + smallest + ", and its length is " + numberCounter[0] + ".");
    }
}








