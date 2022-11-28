/**
 * 7. Написать код программы, которая бы переводила числа из
 * десятичной системы счисления в любую другую.
 */
package chapter2.variantB;

public class DecimalNumberSystem {

    public static void main(String[] args) {

        int[] arguments = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            arguments[i] = Integer.parseInt(args[i]);
        }

        int numberToConvert = arguments[0];
        int foundationOfNewNumberSystem = arguments[1];

        System.out.println("Number " + numberToConvert + " in the chosen number system is equal to " +
                Integer.toString(numberToConvert, foundationOfNewNumberSystem) + ".");
    }
}
