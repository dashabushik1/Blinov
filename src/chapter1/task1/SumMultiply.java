/* 5. Ввести целые числа как аргументы командной строки, подсчитать их сум-
мы и произведения. Вывести результат на консоль. */

package chapter1.task1;

import java.util.Scanner;

public class SumMultiply {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; true; i++) {
            System.out.println("Enter numbers: ");
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            System.out.println("Sum is " + (x + y));
            System.out.println("Multiplication is " + (x * y));
        }
    }
}
