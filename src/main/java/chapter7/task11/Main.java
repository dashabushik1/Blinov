/**
 * 11. Создать массив целых чисел. Убрать все четные элементы из массива
 * и заполнить в конце нулями до прежнего размера массива.
 */
package chapter7.task11;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] numbers = {1, 5, 10, 44, 67, 99, 100, 3, 55, 54, 90};
        int j = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                numbers[i] = 0;
            }
            if (numbers[i] != 0) {
                numbers[j++] = numbers[i];
            }
        }

        for (int i = j; i < numbers.length; i++) {
            numbers[i] = 0;
        }

        System.out.println(Arrays.toString(numbers));
    }
}
