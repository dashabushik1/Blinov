/**
 * 6. Ввести с консоли n целых чисел. На консоль вывести все простые числа.
 */
package chapter1.variantB;

public class PrimeNumbers {

    public static void main(String[] args) {

        System.out.print("Prime numbers: ");
        for (int i = 0; i < args.length; i++) {
            boolean isPrime = true;
            int x = Integer.parseInt(args[i]);
            for (int j = 2; j < x; j++) {
                if (x % j == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                System.out.print(args[i] + " ");
            }
        }
    }
}