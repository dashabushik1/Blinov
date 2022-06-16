/**
 * 10. Ввести с консоли n целых чисел. На консоль вывести числа-палиндромы, значения которых в прямом
 * и обратном порядке совпадают.
 */
package chapter1.task2;

public class PalindromeNumbers {

    public static void main(String[] args) {

        int[] inputNumbers = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            inputNumbers[i] = Integer.parseInt(args[i]);

            int number = inputNumbers[i];
            if ((inputNumbers[i] < 9999) && (inputNumbers[i] > 1000)) {  // в промежутке от 1000 до 9999 (четырехзначные)

                int dig1 = number % 10;
                int dig2 = (number % 100) / 10;
                int dig3 = (number % 1000) / 100;
                int dig4 = (number % 10000) / 1000;


                if ((dig1 == dig4) && (dig2 == dig3)) {
                    System.out.println(inputNumbers[i] + " ");
                }
            }
        }
    }
}
