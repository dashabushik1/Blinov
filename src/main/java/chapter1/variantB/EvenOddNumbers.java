/**
 * 1. Ввести с консоли n целых чисел. На консоль вывести четные и нечетные числа.
 */
package chapter1.variantB;

public class EvenOddNumbers {

    public static void main(String[] args) {

        int[] masEven = new int[args.length];
        int[] masOdd = new int[args.length];

        int evenIndex = 0;
        int oddIndex = 0;

        for (int i = 0; i < args.length; i++) {
            int shift = Integer.parseInt(args[i]);
            if (shift % 2 == 0) {
                masEven[evenIndex] = shift;
                evenIndex++;
            } else {
                masOdd[oddIndex] = shift;
                oddIndex++;
            }
        }

        System.out.print("Even numbers: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(masEven[i] + " ");
        }

        System.out.println(" ");
        System.out.print("Odd numbers: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(masOdd[i] + " ");
        }
    }
}


