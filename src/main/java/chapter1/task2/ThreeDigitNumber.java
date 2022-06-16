/** 5. Ввести с консоли n целых чисел. На консоль вывести все трехзначные числа,
 * в десятичной записи которых нет одинаковых цифр.
 */
package chapter1.task2;

public class ThreeDigitNumber {

    public static void main(String[] args) {

        int[] sortedNumbers = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            sortedNumbers[i] = Integer.parseInt(args[i]);

            if ((sortedNumbers[i] < 1000) && (sortedNumbers[i] > 99)) {  // только трехзначные числа
                int number = sortedNumbers[i];

                int digit1 = number % 10;
                int digit2 = (number % 100) / 10;
                int digit3 = (number % 1000) / 100;

                if (digit1 != digit2 && digit1 != digit3 && digit2 != digit3) {
                    System.out.println(sortedNumbers[i] + " ");
                }
            }
        }
    }
}


