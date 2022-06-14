/**
 * 6. Ввести с консоли n целых чисел. На консоль вывести все простые числа.
 */
package chapter1.task2;

public class PrimeNumbers {

    public static void main(String[] args) {

        System.out.print("Prime numbers: ");
        for (int i = 0; i < args.length; i++) {
            boolean isPrime = true;
            for (int j = 2; j < Integer.parseInt(args[i]); j++) {
                if (Integer.parseInt(args[i]) % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(args[i] + " ");
            }
        }
    }
}