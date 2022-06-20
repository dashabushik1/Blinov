/**
 * 3. Ввести с консоли n целых чисел. На консоль вывести числа, которые делятся на 3 или на 9.
 */
package chapter1.task2;

public class DivByThree {

    public static void main(String[] args) {

        String value = "";
        try {
            for (int i = 0; i < args.length; i++) {
                int z = Integer.parseInt(args[i]);
                if ((z % 3 == 0) || (z % 9 == 0)) {
                    value += z + " ";
                }
            }
            System.out.print("Numbers that are divisible by 3 or by 9: " + value);
        } catch (NumberFormatException e) {
            System.err.println("Entered is not a number.");
        }
    }
}