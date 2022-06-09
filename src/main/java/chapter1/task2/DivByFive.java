/* 4. Ввести с консоли n целых чисел. На консоль вывести числа, которые делятся на 5 и на 7.*/

package chapter1.task2;

import java.util.Scanner;

public class DivByFive {
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
            if ((x % 5 == 0) && (x % 7 == 0)) {
                allNumbers[numIndex] = x;
                numIndex++;
            }
        }

        System.out.println("Numbers that are divisible by 5 and by 7: ");
        for (int i = 0; i < numIndex; i++) {
            System.out.println(allNumbers[i]);
        }
    }


}
