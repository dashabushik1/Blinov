/**
 * 3. Ввести с консоли n целых чисел. На консоль вывести числа, которые делятся на 3 или на 9.
 */
package chapter1.task2;

public class DivByThree {

    public static void main(String[] args) {

        System.out.println("Numbers that are divisible by 3 or by 9: ");
        for (int i = 0; i < args.length; i++) {
            if ((Integer.parseInt(args[i]) % 3 == 0) || (Integer.parseInt(args[i]) % 9 == 0)) {
                System.out.println(args[i] + " ");
            }
        }
    }
}