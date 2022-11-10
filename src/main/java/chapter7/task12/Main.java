/**
 * 12. Продемонстрировать работу лямбда-выражения, которое получает входным параметром целое число x
 * и вычисляет количество вхождений заданной цифры в этом числе.
 */
package chapter7.task12;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        NumberInterface countOccurrences = (n, d) -> {
            int count = 0;
            while (n > 0) {
                count = (n % 10 == d) ? count + 1 : count;
                n = n / 10;
            }
            return count;
        };

        System.out.println("Enter number: ");
        int number = scanner.nextInt();
        System.out.println("Enter digit: ");
        int digit = scanner.nextInt();
        int result = countOccurrences.check(number, digit);
        System.out.println(result);
    }
}
