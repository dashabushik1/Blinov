/**
 * 6. Ввести n чисел с консоли. Найти число, цифры в котором идут в строгом порядке возрастания.
 * Если таких чисел несколько, найти первое из них.
 */
package chapter2.task1;

public class DigitsInStrictAscendingOrder {

    public static void main(String[] args) {

        for (int i = 0; i < args.length; i++) {
            int value = Integer.parseInt(args[i]);
            int result = value;
            boolean flag = true;

            int digit = result % 10;
            result /= 10;
            while (result > 0) {
                if (digit <= result % 10) {
                    flag = false;
                    break;
                }
                digit = result % 10;
                result /= 10;
            }
            if (flag) {
                System.out.println(value + " ");
            }
        }
    }
}




