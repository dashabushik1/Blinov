/**
 * 1. Ввести с консоли n целых чисел. На консоль вывести четные и нечетные числа.
 */
package chapter1.task2;

public class EvenOddNumbers {

    public static void main(String[] args) {

        int[] masEven = new int[args.length];
        int[] masOdd = new int[args.length];

        int evenIndex = 0;
        int oddIndex = 0;

        for (int i = 0; i < args.length; i++) {
            if ((Integer.parseInt(args[i]) % 2 == 0)) {
                masEven[evenIndex] = Integer.parseInt(args[i]);
                evenIndex++;
            } else {
                masOdd[oddIndex] = Integer.parseInt(args[i]);
                oddIndex++;
            }
        }

        System.out.println("Even numbers: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.println(masEven[i] + " ");
        }

        System.out.println("Odd numbers: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.println(masOdd[i] + " ");
        }
    }
}


