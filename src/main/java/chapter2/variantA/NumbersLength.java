/**
 * 2. Ввести n чисел с консоли. Упорядочить и вывести числа в порядке возрастания (убывания) значений
 * их длины.
 */
package chapter2.variantA;

public class NumbersLength {

    public static void main(String[] args) {

        String[] array = new String[args.length];
        for (int i = 0; i < args.length; i++) {
            array[i] = args[i];
        }

        try {
            for (int i = array.length - 1; i > 0; i--) {
                for (int j = 0; j < i; j++) {
                    if (array[j].length() > array[j + 1].length()) {
                        String value = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = value;
                    }
                }
            }
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i] + " ");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}