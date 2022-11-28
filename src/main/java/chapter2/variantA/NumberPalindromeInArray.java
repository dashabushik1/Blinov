/**
 * 8. Ввести n чисел с консоли. Среди чисел найти число-палиндром.
 * Если таких чисел больше одного, найти второе.
 */
package chapter2.variantA;

public class NumberPalindromeInArray {

    public static void main(String[] args) {

        for (int i = 0; i < args.length; i++) {
            boolean isPalindrome = true;
            for (int j = 0; j < args[i].length(); j++) {
                if (args[i].charAt(j) !=
                        args[i].charAt(args[i].length() - j - 1)) {
                    isPalindrome = false;
                    break;
                }
            }
            if (isPalindrome) {
                System.out.println(args[i] + " ");
                System.exit(1);
            }
        }
    }
}
