/**
 * 2. Ввести n чисел с консоли. Упорядочить и вывести числа в порядке возрастания (убывания) значений
 * их длины.
 */
package chapter2.task1;

public class NumbersLength {

    public static void main(String[] args) {

        String[] arr = new String[args.length];

        for (int i = 0; i < args.length; i++) {
            arr[i] = args[i];
        }

        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j].length() > arr[j + 1].length()) {
                    String value = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = value;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}