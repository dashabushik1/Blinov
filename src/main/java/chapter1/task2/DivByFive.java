/**
 * 4. Ввести с консоли n целых чисел. На консоль вывести числа, которые делятся на 5 и на 7.
 */
package chapter1.task2;

public class DivByFive {

    public static void main(String[] args) {

        String value = "";
        for (int i = 0; i < args.length; i++) {
            // как сделать проверку?
            int x = Integer.parseInt(args[i]);
            if ((x % 5 == 0) && (x % 7 == 0)) {
                value += x + " ";
            }
        }
        System.out.print("Numbers that are divisible by 5 and by 7: " + value);
    }
}