/**
 * 5. Ввести с консоли n целых чисел. На консоль вывести элементы,
 * которые равны полусумме соседних элементов.
 */
package chapter1.task2;

public class HalfSumOfNeighboringElements {

    public static void main(String[] args) {

        int[] inputArray = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            inputArray[i] = Integer.parseInt(args[i]);
        }
        for (int i = 0; i < args.length - 2; i++) {
            if (((inputArray[i]) + (inputArray[i + 2])) / 2 == inputArray[i + 1]) {
                System.out.println(inputArray[i + 1] + " ");
            }
        }
    }
}
