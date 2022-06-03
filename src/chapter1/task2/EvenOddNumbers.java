/* 1. Ввести с консоли n целых чисел. На консоль вывести четные и нечетные числа.*/

package chapter1.task2;

import java.util.Scanner;

public class EvenOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter integers: ");
        int n = scanner.nextInt();
        int[] allNumbers = new int[n];

        for (int i = 0; i < allNumbers.length; i++) {
            allNumbers[i] = scanner.nextInt();
        }

        int[] masOdd = new int[n];
        int[] masEven = new int[n];

        int oddIndex = 0;
        int evenIndex = 0;

        for (int i = 0; i < allNumbers.length; i++) {
            if (allNumbers[i] % 3 == 0) {
                masEven[evenIndex] = allNumbers[i];
                evenIndex++;
            } else {
                masOdd[oddIndex] = allNumbers[i];
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






