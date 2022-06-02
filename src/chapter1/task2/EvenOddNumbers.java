/* ¬вести с консоли n целых чисел. Ќа консоль вывести четные и нечетные числа.*/

package chapter1.task2;

import java.util.Arrays;
import java.util.Scanner;

public class EvenOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter integers: ");
        int n = scanner.nextInt(); // считываем числа
        int[] allNumbers = new int[n]; // создаем массив размером n


        for (int i = 0; i < allNumbers.length; i++) {
            allNumbers[i] = scanner.nextInt(); // помещаем все введенные числа в массив
        }

        int[] masOdd = new int[n];
        int[] masEven = new int[n]; //создаем массивы дл€ четных и нечет чисел

        int oddIndex = 0;
        int evenIndex = 0; //создаем счетчики текущего элемента

        for (int i = 0; i < n; i++) {
            if (allNumbers[i] % 2 == 0) {
                masEven[evenIndex] = allNumbers[i];
                evenIndex++;
            } else {
                masOdd[oddIndex] = allNumbers[i];
                oddIndex++;
            }
        }
            System.out.println("Even numbers: " + Arrays.toString(masEven));
            System.out.println("Odd numbers: " + Arrays.toString(masOdd));
        }
}






