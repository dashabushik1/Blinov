/**
 * 5. Ввести с консоли n целых чисел. На консоль вывести все трехзначные числа,
 * в десятичной записи которых нет одинаковых цифр.
 */
package chapter1.task2;

public class ThreeDigitNumber {

    public static void main(String[] args) {

        int[] masThreeDigitNumbers = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            masThreeDigitNumbers[i] = Integer.parseInt(args[i]);

            if ((masThreeDigitNumbers[i] < 1000) && (masThreeDigitNumbers[i] > 99)) {  // только трехзначные числа
                int number = masThreeDigitNumbers[i];

                int numeric1 = number % 10;
                int numeric2 = (number % 100) / 10;
                int numeric3 = (number % 1000) / 100;

                if (numeric1 != numeric2 && numeric1 != numeric3 && numeric2 != numeric3) {
                    System.out.println(masThreeDigitNumbers[i] + " ");
                }
            }
        }
    }
}


