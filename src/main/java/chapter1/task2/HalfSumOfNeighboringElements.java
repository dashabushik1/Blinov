/**
 * 5. Ввести с консоли n целых чисел. На консоль вывести элементы,
 * которые равны полусумме соседних элементов.
 */
package chapter1.task2;

public class HalfSumOfNeighboringElements {

    public static void main(String[] args) {

        int[] inputNumbers = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            inputNumbers[i] = Integer.parseInt(args[i]);
        }
        for (int i = 0; i < args.length - 2; i++) {
            if (((inputNumbers[i]) + (inputNumbers[i + 2])) / 2 == inputNumbers[i + 1]) {
                System.out.println(inputNumbers[i + 1] + " ");
            }
        }
    }
}
