/**
 * 10. Ввести с консоли n целых чисел. На консоль вывести числа-палиндромы, значения которых в прямом
 * и обратном порядке совпадают.
 */
package chapter1.variantB;

public class PalindromeNumbers {

    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            boolean flag = true;
            for (int j = 0; j < args[i].length(); j++) {
                if (args[i].toCharArray()[j] !=
                        args[i].toCharArray()[args[i].length() - 1 - j]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(args[i] + " ");
            }
        }
    }
}
