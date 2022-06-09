/* 3. Ввести с консоли n целых чисел. На консоль вывести числа, которые делятся на 3 или на 9. */

package chapter1.task2;

import java.util.Scanner;

public class DivByThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of digits: ");
        int size = scanner.nextInt();
        System.out.println("Enter numbers: ");
        int[] allNumbers = new int[size];

        for (int i = 0; i < allNumbers.length; i++) {
            allNumbers[i] = scanner.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
        }

        int numIndex = 0;

        for (int i = 0; i < size; i++) {
            int x = scanner.nextInt();
            if ((x % 3 == 0) || (x % 9 == 0)) {
                allNumbers[numIndex] = x;
                numIndex++;
            }
        }

        System.out.println("Numbers that are divisible by 3 or by 9: ");
        for (int i = 0; i < numIndex; i++) {
            System.out.println(allNumbers[i]);
        }
    }
}
