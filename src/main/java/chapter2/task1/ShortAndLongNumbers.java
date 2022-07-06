/**
 * 1. Ввести n чисел с консоли. Найти самое короткое и самое длинное число. Вывести найденные числа
 * и их длину.
 */
package chapter2.task1;

public class ShortAndLongNumbers {

    public static void main(String[] args) {
        int min = 10;
        int max = 0;

        String minStr = null;
        String maxStr = null;

        try {
        for (String element : args) {
            if (element.length() < min) {
                min = element.length();
                minStr = element;
            }
            if (element.length() > max) {
                max = element.length();
                maxStr = element;
            }
        }
        System.out.println("The shortest number is  " + minStr + ", and its length is " + min
                + ".\nThe longest number is " + maxStr + ", and its length is " + max
                + ".");
    } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}






