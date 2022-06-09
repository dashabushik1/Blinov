/* 5. Ввести с консоли n целых чисел. На консоль вывести все трехзначные числа, в десятичной записи которых нет одинаковых
цифр. */

package chapter1.task2;

import java.util.Scanner;

public class ThreeDigitNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of digits: ");
        String n = scanner.nextLine();
        System.out.println("Enter numbers: ");
        String[] allNumbers = new String[Integer.parseInt(n)];

        for (int i = 0; i < Integer.parseInt(n); i++) {
            allNumbers[i] = scanner.nextLine();
        }

        String number;

        System.out.println("All three-digit numbers that don't have the same decimal notation numbers:  ");
        for (String sourceNumber : allNumbers) {
            if ((int) Math.log10(Math.abs(Integer.parseInt(sourceNumber))) + 1 == 3) {
                number = sourceNumber;
                if ((number.charAt(0) != number.charAt(1))
                        && (number.charAt(1) != number.charAt(2))  // Метод charAt() — возвращает символ, расположенный по указанному индексу строки.
                        && (number.charAt(0) != number.charAt(2))) {
                    System.out.print(sourceNumber + " ");
                }
            }
        }
    }
}

