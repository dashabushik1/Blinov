/**
 * 4. Ввести с консоли n целых чисел. На консоль вывести числа, которые делятся на 5 и на 7.
 */
package chapter1.task2;

public class DivByFive {

    public static void main(String[] args) {

        System.out.print("Numbers that are divisible by 5 and by 7: ");
        for (int i = 0; i < args.length; i++) {
            if ((Integer.parseInt(args[i]) % 5 == 0) && (Integer.parseInt(args[i]) % 7 == 0)) {
                System.out.print(args[i] + " ");
            }
        }
    }
}