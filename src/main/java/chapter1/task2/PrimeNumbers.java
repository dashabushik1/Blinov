/* 5. Ввести с консоли n целых чисел. На консоль вывести все простые числа. */

package chapter1.task2;


import java.util.Scanner;

public class PrimeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter integers: ");
        int n = scanner.nextInt();
        int[] allNumbers = new int[n];

        for (int i = 0; i < n; i++) {
            allNumbers[i] = scanner.nextInt();
        }

        System.out.println("Prime numbers are: ");
        for (int i = 0; i < allNumbers.length; i++) {
            if (isPrime(allNumbers[i])) {
                System.out.println(allNumbers[i]);

            }
        }
    }
    public static boolean isPrime(int n) {
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}