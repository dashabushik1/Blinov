/**
 * 5. Ввести с консоли n целых чисел. На консоль вывести все трехзначные числа,
 * в десятичной записи которых нет одинаковых цифр.
 */
package chapter1.task2;

public class ThreeDigitNumber {

    public static void main(String[] args) {

        String number;
        System.out.println("All three-digit numbers that don't have the same decimal notation numbers:  ");
        for (String sourceNumber : args) {
            number = sourceNumber;
            if ((int) Math.log10(Math.abs(Integer.parseInt(sourceNumber))) + 1 == 3) {
                if ((sourceNumber.charAt(0)) != (sourceNumber.charAt(1))
                        && (sourceNumber.charAt(1) != sourceNumber.charAt(2))
                        && (sourceNumber.charAt(0) != sourceNumber.charAt(2))) {
                    System.out.println(sourceNumber + " ");
                }
            }
        }
    }
}
